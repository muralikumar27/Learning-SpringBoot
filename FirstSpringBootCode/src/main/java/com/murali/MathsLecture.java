package com.murali;

import org.springframework.stereotype.Component;

@Component("maths")
public class MathsLecture implements Lecture {

	@Override
	public void lectures() {
		// TODO Auto-generated method stub
		System.out.print("Study with maths lecture");
	}

}
