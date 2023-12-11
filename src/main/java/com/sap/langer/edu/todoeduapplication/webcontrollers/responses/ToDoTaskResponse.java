package com.sap.langer.edu.todoeduapplication.webcontrollers.responses;

import com.sap.langer.edu.todoeduapplication.domain.ToDoStatus;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

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
