package com.sap.langer.edu.todoeduapplication.webcontrollers.responses;

import com.sap.langer.edu.todoeduapplication.domain.ToDoListStatus;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

import lombok.Data;


@Data
public class ToDoListResponse implements Serializable
{
	private Long id;
	private LocalDateTime created;
	private LocalDateTime modified;
	private String title;
	private ToDoListStatus status;
	private LocalDateTime statusChanged;
	private List<ToDoTaskResponse> tasks;
}
