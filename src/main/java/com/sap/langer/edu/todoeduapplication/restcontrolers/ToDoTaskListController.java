package com.sap.langer.edu.todoeduapplication.restcontrolers;

import com.sap.langer.edu.todoeduapplication.restcontrolers.responses.ToDoListResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class ToDoTaskListController {
    @GetMapping("/todolist/{listId}")
    public List<ToDoListResponse> getToDoList(@PathVariable final Long listId) {
        return List.of();
    }
}
