package com.medzy.restful.todo.service.internal;

import com.medzy.restful.todo.model.Todo;
import com.medzy.restful.todo.model.internal.TodoImp;
import com.medzy.restful.todo.service.TodoService;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class TodoServiceImpTest {
    @Autowired
    private TodoService todoService;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getEmptyTodoList() {
        ArrayList<Todo> result = todoService.getTodoList();
        Assert.assertThat(result.size(), Matchers.equalTo(0));
    }

    @Test
    public void addTodoList() {
        TodoImp todo = new TodoImp();
        todo.setTitle("Title");
        todo.setDescription("Description");
        todo.setFlag(true);
        todoService.getTodoList().add(todo);

        ArrayList<Todo> result = todoService.getTodoList();

        Assert.assertThat(result.size(), Matchers.equalTo(1));
        Assert.assertThat(result.get(0).getTitle(), Matchers.equalTo("Title"));
        Assert.assertThat(result.get(0).getDescription(), Matchers.equalTo("Description"));
        Assert.assertThat(result.get(0).isFlag(), Matchers.equalTo(true));
    }
}