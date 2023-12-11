package com.sap.langer.edu.todoeduapplication.services;

import org.springframework.stereotype.Service;

import com.sap.langer.edu.todoeduapplication.repositories.ToDoListRepository;
import com.sap.langer.edu.todoeduapplication.services.dtos.ToDoListDTO;

@Service
public class ToDoListService
{
	private final ToDoListRepository toDoListRepository;

	public ToDoListService(final ToDoListRepository toDoListRepository)
	{
		this.toDoListRepository = toDoListRepository;
	}

	public ToDoListDTO getToDoList(final Long id)
	{
		return null;
	}
}
