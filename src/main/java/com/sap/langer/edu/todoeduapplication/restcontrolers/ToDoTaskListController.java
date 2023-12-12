package com.sap.langer.edu.todoeduapplication.restcontrolers;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sap.langer.edu.todoeduapplication.restcontrolers.dtos.NewToDoListDTO;
import com.sap.langer.edu.todoeduapplication.restcontrolers.responses.ToDoListResponse;
import com.sap.langer.edu.todoeduapplication.services.ToDoListService;

@RestController
@RequestMapping(value = "/api/v1", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class ToDoTaskListController {
	private final ToDoListService toDoListService;

	public ToDoTaskListController(final ToDoListService toDoListService)
	{
		this.toDoListService = toDoListService;
	}

	@GetMapping("/todolist/{listId}")
    public List<ToDoListResponse> getToDoList(@PathVariable final Long listId) {
        return List.of();
    }

	@PostMapping("/todolist")
	public void addToDoList(@RequestBody final NewToDoListDTO toDoList)
	{
		toDoListService.createNewToDoList(toDoList);
	}
}
