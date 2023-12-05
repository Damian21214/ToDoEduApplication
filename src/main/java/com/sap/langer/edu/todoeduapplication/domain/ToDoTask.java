package com.sap.langer.edu.todoeduapplication.domain;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class ToDoTask extends BaseEntity {
    @Basic
    @Column(length = 64, nullable = false)
    private String title;

    @Basic
    @Column(length = 1024, nullable = true)
    private String description;

    @Enumerated(EnumType.STRING)
    private ToDoStatus status;

    @Basic
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime statusChanged;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime scheduled;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private ToDoList toDoList;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ToDoTask toDoTask)) return false;

        if (!Objects.equals(title, toDoTask.title)) return false;
        if (!Objects.equals(description, toDoTask.description))
            return false;
        if (status != toDoTask.status) return false;
        if (!Objects.equals(statusChanged, toDoTask.statusChanged))
            return false;
        if (!Objects.equals(scheduled, toDoTask.scheduled)) return false;
        return Objects.equals(toDoList, toDoTask.toDoList);
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (statusChanged != null ? statusChanged.hashCode() : 0);
        result = 31 * result + (scheduled != null ? scheduled.hashCode() : 0);
        result = 31 * result + (toDoList != null ? toDoList.hashCode() : 0);
        return result;
    }
}
