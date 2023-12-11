package com.sap.langer.edu.todoeduapplication.services.dtos;

import java.time.LocalDateTime;
import java.util.List;

import com.sap.langer.edu.todoeduapplication.domain.ToDoListStatus;

import lombok.Data;

@Data
public class ToDoListDTO
{
	private Long id;
	private String title;
	private ToDoListStatus status;
	private LocalDateTime statusChanged;
	private List<ToDoTaskDTO> tasks;
}
