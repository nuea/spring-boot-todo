package com.medzy.restful.todo;

import com.medzy.restful.todo.model.Todo;
import com.medzy.restful.todo.service.internal.TodoServiceImp;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.AbstractList;
import java.util.ArrayList;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class TodoControllerTest {

    private TodoController todoController;

    @Before
    public void setUp() throws Exception {
        todoController = new TodoController();
        todoController.setTodoService(new TodoServiceImp());
    }

    @Test
    public void getEmtpyTodoList() {
        ArrayList<Todo> todoList = todoController.getTodoList();

        Assert.assertThat(todoList.size(), Matchers.equalTo(0));
    }
}