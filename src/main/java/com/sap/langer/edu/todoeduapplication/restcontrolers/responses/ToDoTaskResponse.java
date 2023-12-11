package com.sap.langer.edu.todoeduapplication.restcontrolers.responses;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.sap.langer.edu.todoeduapplication.domain.ToDoStatus;

import lombok.Data;

@Data
public class ToDoTaskResponse implements Serializable
{
	private Long id;
	private LocalDateTime created;
	private LocalDateTime modified;
	private String title;
	private String description;
	private ToDoStatus status;
	private LocalDateTime statusChanged;
	private LocalDateTime scheduled;
}
