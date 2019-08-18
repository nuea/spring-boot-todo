package com.medzy.restful.config;

import com.medzy.restful.todo.service.TodoService;
import com.medzy.restful.todo.service.internal.TodoServiceImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ThreadPoolExecutor;

@Configuration
public class TodoConfiguration {
    @Bean
    public TodoService todoService() {
        return new TodoServiceImp();
    }
}
