package com.murali;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Autowired
	@Qualifier("science")
	private Lecture lecture;
	
	public void study() {
		lecture.lectures();
	}
}
