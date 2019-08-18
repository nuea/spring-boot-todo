package com.medzy.restful.todo.service;

import com.medzy.restful.todo.model.Todo;
import com.medzy.restful.todo.model.internal.TodoImp;

import java.util.ArrayList;

public interface TodoService {
    ArrayList<Todo> getTodoList();

    void createTodoList(Todo todo);

    Todo getTodoListById(long id);

    Todo updateTodoListById(long id, TodoImp todo);

    void deleteTodoListById(long id);
}
