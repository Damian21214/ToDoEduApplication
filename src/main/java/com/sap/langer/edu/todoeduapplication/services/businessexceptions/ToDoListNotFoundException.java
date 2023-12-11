package com.sap.langer.edu.todoeduapplication.services.businessexceptions;

public class ToDoListNotFoundException extends RuntimeException
{
	public ToDoListNotFoundException(final Long id)
	{
		super("Couldn't find ToDoList with id: " + id);
	}
}
