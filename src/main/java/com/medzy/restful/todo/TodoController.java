package com.medzy.restful.todo;

import com.medzy.restful.todo.model.Todo;
import com.medzy.restful.todo.model.internal.TodoImp;
import com.medzy.restful.todo.service.TodoService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.Console;
import java.util.ArrayList;

@Setter
@RestController
@RequestMapping("/todo")
public class TodoController {

	@Autowired
	private TodoService todoService;

//	@RequestMapping(method = RequestMethod.GET, path = "/all") or
	@GetMapping(path = "")
	public ArrayList<Todo> getTodoList() {
		return todoService.getTodoList();
	}

	@GetMapping(path = "/{id}")
	public Todo getTodoListById(@PathVariable(value = "id") long id) {
		return todoService.getTodoListById(id);
	}

	@PostMapping(path = "/create")
	public String addTodoList(@RequestBody TodoImp todo) {
		todoService.createTodoList(todo);
		return "Succeed!";
	}

	@PutMapping(path = "/update/{id}")
	public Todo updateTodoListById(@PathVariable(value = "id") long id, @Valid @RequestBody TodoImp todo) {
		Todo result = todoService.updateTodoListById(id, todo);
		return result;
	}

	@DeleteMapping(path = "delete/{id}")
	public String deleteTodoListById(@PathVariable(value = "id") long id){
		todoService.deleteTodoListById(id);
		return "Succeed!";
	}

}
