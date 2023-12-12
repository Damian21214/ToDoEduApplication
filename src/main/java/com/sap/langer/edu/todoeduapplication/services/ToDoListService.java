package com.sap.langer.edu.todoeduapplication.services;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sap.langer.edu.todoeduapplication.domain.ToDoList;
import com.sap.langer.edu.todoeduapplication.domain.ToDoStatus;
import com.sap.langer.edu.todoeduapplication.domain.ToDoTask;
import com.sap.langer.edu.todoeduapplication.repositories.ToDoListRepository;
import com.sap.langer.edu.todoeduapplication.repositories.ToDoTaskRepository;
import com.sap.langer.edu.todoeduapplication.services.businessexceptions.ToDoListNotFoundException;
import com.sap.langer.edu.todoeduapplication.services.dtos.ToDoListDTO;
import com.sap.langer.edu.todoeduapplication.webcontrollers.formdtos.NewToDoTask;

import lombok.extern.java.Log;

@Log
@Service
public class ToDoListService
{
	private final ToDoListRepository toDoListRepository;
	private final ToDoTaskRepository toDoTaskRepository;
	private final ModelMapper modelMapper;

	public ToDoListService(final ToDoListRepository toDoListRepository, final ToDoTaskRepository toDoTaskRepository,
	                       final ModelMapper modelMapper)
	{
		this.toDoListRepository = toDoListRepository;
		this.toDoTaskRepository = toDoTaskRepository;
		this.modelMapper = modelMapper;
	}

	public ToDoListDTO getToDoList(final Long id)
	{
		final ToDoList toDoList = toDoListRepository.findById(id).orElseThrow(() -> new ToDoListNotFoundException(id));
		return convertToDto(toDoList);
	}

	@Transactional
	public void addTaskToToDoList(final NewToDoTask newToDoTask)
	{
		final ToDoList toDoList = toDoListRepository.findById(newToDoTask.getListId())
		                                            .orElseThrow(() -> new ToDoListNotFoundException(newToDoTask.getListId()));
		final ToDoTask toDoTask = convertToEntity(newToDoTask);
		toDoTask.setToDoList(toDoList);
		toDoTask.setStatus(ToDoStatus.CREATED);
		final ToDoTask saved = toDoTaskRepository.save(toDoTask);
		log.info("Saved: " + saved);

	}

	private ToDoListDTO convertToDto(final ToDoList toDoList)
	{
		return modelMapper.map(toDoList, ToDoListDTO.class);
	}

	private ToDoTask convertToEntity(final NewToDoTask newToDoTask)
	{
		final ToDoTask newTask = modelMapper.map(newToDoTask, ToDoTask.class);
		newTask.setId(null);
		return newTask;
	}
}
