package com.example.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.beans.*;

@Controller
public class UserInsert {
	
	@RequestMapping(method = RequestMethod.POST, value="/user/insert")
	
	@ResponseBody
	public ResponseEntity<?> registerStudent(@RequestBody User user) {
		return userAdd.getInstance().addUser(user);
	}
	
}