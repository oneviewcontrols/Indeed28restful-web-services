package com.udemy.rest.webservices.restfulwebservices.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoHardcodedService {
	
	private static List<Todo> todos = new ArrayList<>();
	private static int idCounter = -1;
	static {
		todos.add(new Todo(++idCounter, "ansancle", "Learn Spring",new Date() ,false));
		todos.add(new Todo(++idCounter, "ansancle", "Learn Sql",new Date() ,false));
		todos.add(new Todo(++idCounter, "ansancle", "Learn Ruby",new Date() ,false));
		todos.add(new Todo(++idCounter, "ansancle", "Learn React",new Date() ,false));
	}
	
	public static List<Todo> findAll() {
		return todos;
	}


	
}
