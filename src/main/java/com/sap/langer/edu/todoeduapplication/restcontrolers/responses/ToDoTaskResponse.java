package com.sap.langer.edu.todoeduapplication.restcontrolers.responses;

import com.sap.langer.edu.todoeduapplication.domain.ToDoStatus;

import java.io.Serializable;
import java.time.LocalDateTime;

public record ToDoTaskResponse(Long id, LocalDateTime created, LocalDateTime modified, String title, String description,
                               ToDoStatus status, LocalDateTime statusChanged,
                               LocalDateTime scheduled) implements Serializable {
}
