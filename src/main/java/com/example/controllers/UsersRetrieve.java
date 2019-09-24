package com.example.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.beans.*;

@Controller
public class UsersRetrieve { 
	
	@RequestMapping(method = RequestMethod.GET, value="/user/all")
	
	@ResponseBody
	public ResponseEntity<?> getAllUsers() {
		return userAdd.getInstance().getUserList();
	}
	
}