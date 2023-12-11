package com.sap.langer.edu.todoeduapplication.webcontrollers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sap.langer.edu.todoeduapplication.services.ToDoListService;
import com.sap.langer.edu.todoeduapplication.services.dtos.ToDoListDTO;
import com.sap.langer.edu.todoeduapplication.webcontrollers.responses.ToDoListResponse;

@Controller
@RequestMapping(value = "/html")
public class ToDoTaskListWebController {
	private final ToDoListService toDoListService;
	private final ModelMapper modelMapper;

	public ToDoTaskListWebController(final ToDoListService toDoListService, final ModelMapper modelMapper)
	{
		this.toDoListService = toDoListService;
		this.modelMapper = modelMapper;
	}

	@GetMapping("/todolist/{listId}")
    public String getToDoList(@PathVariable final Long listId, final Model model) {
        model.addAttribute("todoTaskList", findToDoList(listId));
        return "tasklist";
    }

   private ToDoListResponse findToDoList(final Long listId) {
	   final ToDoListDTO toDoList = toDoListService.getToDoList(listId);
	   return convertToResponse(toDoList);
   }

	private ToDoListResponse convertToResponse(final ToDoListDTO toDoList)
	{
		return modelMapper.map(toDoList, ToDoListResponse.class);
	}
}
