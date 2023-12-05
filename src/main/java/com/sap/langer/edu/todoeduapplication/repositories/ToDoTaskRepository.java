package com.sap.langer.edu.todoeduapplication.repositories;

import com.sap.langer.edu.todoeduapplication.domain.ToDoTask;
import org.springframework.data.repository.ListCrudRepository;

public interface ToDoTaskRepository extends ListCrudRepository<ToDoTask, Long> {
}
