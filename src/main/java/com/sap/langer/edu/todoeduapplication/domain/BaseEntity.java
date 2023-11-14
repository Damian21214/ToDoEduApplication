package com.sap.langer.edu.todoeduapplication.domain;

import lombok.Data;

import java.time.LocalDateTime;


@Data
public class BaseEntity {
    private Long id;
    private LocalDateTime created;
    private LocalDateTime modified;
}
