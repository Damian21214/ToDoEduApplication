package com.sap.langer.edu.todoeduapplication.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class ToDoList extends BaseEntity {
    private String title;
    private ToDoListStatus status;
    private LocalDateTime statusChanged;
    private List<ToDoTask> tasks;
}
