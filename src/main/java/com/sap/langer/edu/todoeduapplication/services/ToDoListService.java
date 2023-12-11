package com.sap.langer.edu.todoeduapplication.services;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.sap.langer.edu.todoeduapplication.domain.ToDoList;
import com.sap.langer.edu.todoeduapplication.repositories.ToDoListRepository;
import com.sap.langer.edu.todoeduapplication.services.businessexceptions.ToDoListNotFoundException;
import com.sap.langer.edu.todoeduapplication.services.dtos.ToDoListDTO;

@Service
public class ToDoListService
{
	private final ToDoListRepository toDoListRepository;
	private final ModelMapper modelMapper;

	public ToDoListService(final ToDoListRepository toDoListRepository, final ModelMapper modelMapper)
	{
		this.toDoListRepository = toDoListRepository;
		this.modelMapper = modelMapper;
	}

	public ToDoListDTO getToDoList(final Long id)
	{
		final ToDoList toDoList = toDoListRepository.findById(id).orElseThrow(() -> new ToDoListNotFoundException(id));
		return convertToDto(toDoList);
	}

	private ToDoListDTO convertToDto(final ToDoList toDoList)
	{
		return modelMapper.map(toDoList, ToDoListDTO.class);
	}
}
