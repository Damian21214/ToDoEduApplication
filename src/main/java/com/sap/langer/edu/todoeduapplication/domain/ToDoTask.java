package com.sap.langer.edu.todoeduapplication.domain;


import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
public class ToDoTask extends BaseEntity {
    private String title;
    private String description;
    private ToDoStatus status;
    private LocalDateTime statusChanged;
    private LocalDateTime scheduled;
}
