package com.callahan.beans;

import java.util.ArrayList;
import java.util.List;

public class StudentRegistration {

	public StudentRegistration (String message, String gender, int id) {
		super();
		this.message = message;
		this.gender = gender;
		this.id = id;
	}

	private final String message;

	public String getMessage() {
		return message;
	}

	private final String gender;

	public String getGender() {
		return gender;
	}
	
	private final int id;

	public int getId() {
		return id;
	}
}
