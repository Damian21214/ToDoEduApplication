package com.sap.langer.edu.todoeduapplication.webcontrollers.formdtos;

import lombok.Data;

@Data
public class NewToDoTask
{
	private Long listId;
	private String title;
	private String description;
	private String scheduled;
}
