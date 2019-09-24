package com.example.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.beans.*;

@Controller
public class UserGetById { 
	
	@RequestMapping(method = RequestMethod.GET, value="/user/{id}")
	
	@ResponseBody
	public ResponseEntity<?> getUser(@PathVariable("id") String id) {
		return userAdd.getInstance().getUser(id);
	}
	
}