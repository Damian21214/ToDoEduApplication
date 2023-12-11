package com.sap.langer.edu.todoeduapplication.webcontrollers;

import com.sap.langer.edu.todoeduapplication.domain.ToDoListStatus;
import com.sap.langer.edu.todoeduapplication.domain.ToDoStatus;
import com.sap.langer.edu.todoeduapplication.webcontrollers.responses.ToDoListResponse;
import com.sap.langer.edu.todoeduapplication.webcontrollers.responses.ToDoTaskResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.util.List;

@Controller
@RequestMapping(value = "/html")
public class ToDoTaskListWebController {
    @GetMapping("/todolist/{listId}")
    public String getToDoList(@PathVariable final Long listId, final Model model) {
        model.addAttribute("todoTaskList", createFakeData());
        return "tasklist";
    }

    private ToDoListResponse createFakeData() {
        ToDoTaskResponse taskResponse = new ToDoTaskResponse(
                1L,
                LocalDateTime.now(),
                LocalDateTime.now(),
                "Title",
                "Description",
                ToDoStatus.COMPLETED,
                LocalDateTime.now(),
                LocalDateTime.now().plusDays(3)
        );

        List<ToDoTaskResponse> tasks = List.of(taskResponse);

        return new ToDoListResponse(
                1L,
                LocalDateTime.now(),
                LocalDateTime.now(),
                "Title",
                ToDoListStatus.CREATED,
                LocalDateTime.now(),
                tasks
        );
    }
}
