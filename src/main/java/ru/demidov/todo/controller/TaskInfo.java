package ru.demidov.todo.controller;

import lombok.Data;
import ru.demidov.todo.domain.Status;

@Data
public class TaskInfo {
    private String description;
    private Status status;
}
