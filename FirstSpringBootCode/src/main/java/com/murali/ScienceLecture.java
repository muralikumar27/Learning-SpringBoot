package com.murali;

import org.springframework.stereotype.Component;

@Component("science")
public class ScienceLecture implements Lecture {

	@Override
	public void lectures() {
		// TODO Auto-generated method stub
		System.out.print("Studey with science lecture");

	}

}
