package com.restfulwebservices.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.restfulwebservices.model.Todo;

@Service
public class TodoHardcodedService {

	private static List<Todo> todos = new LinkedList<>();
	private static long idCounter = 0;

	static {
		try {
			todos.add(new Todo(++idCounter, "pushkar", "Learn to Dance", false,
					new SimpleDateFormat("yyyy-MM-dd").parse(LocalDateTime
							.from(new Date().toInstant().atZone(ZoneId.of("UTC"))).plusDays(1).toString())));
			todos.add(new Todo(++idCounter, "pushkar", "Become an expert at Angular", false,
					new SimpleDateFormat("yyyy-MM-dd").parse(LocalDateTime
							.from(new Date().toInstant().atZone(ZoneId.of("UTC"))).plusDays(2).toString())));
			todos.add(new Todo(++idCounter, "pushkar", "Visit India", false, new SimpleDateFormat("yyyy-MM-dd").parse(
					LocalDateTime.from(new Date().toInstant().atZone(ZoneId.of("UTC"))).plusDays(3).toString())));
			todos.add(new Todo(++idCounter, "pushkar", "Learn about Microservices", false,
					new SimpleDateFormat("yyyy-MM-dd").parse(LocalDateTime
							.from(new Date().toInstant().atZone(ZoneId.of("UTC"))).plusDays(4).toString())));
			todos.add(new Todo(++idCounter, "pushkar", "Learn React", false, new SimpleDateFormat("yyyy-MM-dd").parse(
					LocalDateTime.from(new Date().toInstant().atZone(ZoneId.of("UTC"))).plusDays(5).toString())));
			todos.add(new Todo(++idCounter, "pushkar", "Learn Javascript", false,
					new SimpleDateFormat("yyyy-MM-dd").parse(LocalDateTime
							.from(new Date().toInstant().atZone(ZoneId.of("UTC"))).plusDays(6).toString())));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public List<Todo> findAll() {
		return todos;
	}

	public Todo deleteById(long id) {
		Todo todo = findById(id);
		if (todo == null) {
			return null;
		} else if (todos.remove(todo)) {
			return todo;
		} else {
			return null;
		}
	}

	public Todo findById(long id) {
		for (Todo todo : todos) {
			if (todo.getId() == id) {
				return todo;
			}
		}
		return null;
	}

	public Todo save(Todo todo) {
		if (todo.getId() == -1 || todo.getId() == 0) {
			todo.setId(++idCounter);
			todos.add(todo);
		} else {
			deleteById(todo.getId());
			todos.add(todo);
		}
		return todo;
	}
}
