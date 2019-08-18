package com.medzy.restful.todo.model.internal;

import com.medzy.restful.todo.model.Todo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TodoImp implements Todo {
    private String title;
    private String description;
    private boolean flag;
}
