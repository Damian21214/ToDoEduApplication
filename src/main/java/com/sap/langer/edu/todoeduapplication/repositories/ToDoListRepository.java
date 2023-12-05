package com.sap.langer.edu.todoeduapplication.repositories;

import com.sap.langer.edu.todoeduapplication.domain.ToDoList;
import org.springframework.data.repository.ListCrudRepository;

public interface ToDoListRepository extends ListCrudRepository<ToDoList, Long> {
}
