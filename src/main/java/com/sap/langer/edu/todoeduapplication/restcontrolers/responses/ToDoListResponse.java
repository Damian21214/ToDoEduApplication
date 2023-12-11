package com.sap.langer.edu.todoeduapplication.restcontrolers.responses;

import com.sap.langer.edu.todoeduapplication.domain.ToDoListStatus;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;


public record ToDoListResponse(Long id, LocalDateTime created, LocalDateTime modified, String title,
                               ToDoListStatus status, LocalDateTime statusChanged,
                               List<ToDoTaskResponse> tasks) implements Serializable {
}
