package com.medzy.restful.todo.service.internal;

import com.medzy.restful.todo.model.Todo;
import com.medzy.restful.todo.model.internal.TodoImp;
import com.medzy.restful.todo.service.TodoService;
import lombok.Getter;

import java.util.ArrayList;

@Getter
public class TodoServiceImp implements TodoService {

    private ArrayList<Todo> todoList;

    public TodoServiceImp() {
        todoList = new ArrayList<>();
    }

    @Override
    public void createTodoList(Todo todo) {
        todoList.add(todo);
    }

    @Override
    public Todo getTodoListById(long id) {
        return todoList.get((int) id);
    }

    @Override
    public Todo updateTodoListById(long id, TodoImp todo) {
        todoList.set((int) id, todo);
        return todoList.get((int) id);
    }

    @Override
    public void deleteTodoListById(long id) {
        todoList.remove((int) id);
    }
}
