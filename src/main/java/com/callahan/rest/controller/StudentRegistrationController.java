package com.callahan.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.callahan.beans.StudentRegistration;

import org.springframework.stereotype.Controller;


@Controller

public class StudentRegistrationController {
	
	private static final String welcomemsg = "Welcome Student %s!";

	@GetMapping("/welcome/student")

    @ResponseBody

    public StudentRegistration welcomeStudent(@RequestParam(name="name", required=false, defaultValue="Katie Student") String name,
    										  @RequestParam(name="gender", required=false, defaultValue="Female") String gender,
    										  @RequestParam(name="id", required=false, defaultValue="0") int id) {

        return new StudentRegistration(String.format(welcomemsg, name), String.format(welcomemsg, gender), id);

    }

}
