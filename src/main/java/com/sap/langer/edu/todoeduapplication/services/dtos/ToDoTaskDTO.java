package com.sap.langer.edu.todoeduapplication.services.dtos;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.sap.langer.edu.todoeduapplication.domain.ToDoStatus;

import lombok.Data;

@Data
public class ToDoTaskDTO implements Serializable
{
	private Long id;
	private String title;
	private String description;
	private ToDoStatus status;
	private LocalDateTime scheduled;
}
