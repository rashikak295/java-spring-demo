package com.example.beans;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

// SINGLETON CLASS
public class userAdd {
	
	// VARIABLES
	private List<User> users;
	private static userAdd add = null;
	
	/**
	 * PRIVATE CONSTRUCTOR
	 */
	private userAdd() {
		users = new ArrayList<User>();	
	}
	
	/**
	 * GET THE INSTANCE OF THE SINGLETON CLASS
	 * @return class instance
	 */
	public static userAdd getInstance() {
		if (add == null) {
			add = new userAdd();
			return add;
		}
		else {
			return add;
		}
	}
	
	/**
	 * INSERTS USER INTO LIST
	 * @param usr json object
	 * @return ResponseEntity object as HTTP STATUS CODE
	 */
	public ResponseEntity<User> addUser(User usr) {
		for(int i=0 ; i<users.size() ; i++) {
			User user = users.get(i);
			if (user.getFirstname().equals(usr.firstname) && user.getLastname().equals(usr.lastname)) {
				return new ResponseEntity<User>(HttpStatus.BAD_REQUEST);
			}
			else if(user.getId().equals(usr.id)) {
				return new ResponseEntity<User>(HttpStatus.BAD_REQUEST);
			}
		}
		users.add(usr);
		return new ResponseEntity<User>(HttpStatus.OK);
	}

	/**
	 * DELETE USER FROM LIST
	 * @param id 
	 * @return ResponseEntity object as HTTP STATUS CODE
	 */
	public ResponseEntity<User> deleteUser(String id) {
		for(int i=0 ; i<users.size() ; i++) {
			User user = users.get(i);
			if(user.getId().equals(id)) {
				users.remove(i);
				return new ResponseEntity<User>(HttpStatus.OK);
			}
		}
		return new ResponseEntity<User>(HttpStatus.BAD_REQUEST);
	}
	
	/**
	 * RETURNS LIST OF USERS
	 * @return ResponseEntity object as USER LIST AND HTTP STATUS CODE
	 */
	public ResponseEntity<List<User>> getUserList() {
		Collections.sort(users);
		return new ResponseEntity<List<User>>(users,HttpStatus.OK);	
	}
	
	/**
	 * RETURNS A USER WITH SPECIFIC ID
	 * @param id
	 * @return ResponseEntity object as USER AND HTTP STATUS CODE
	 */
	public ResponseEntity<User> getUser(String id) {
		for(int i=0 ; i<users.size() ; i++) {
			User user = users.get(i);
			if(user.getId().equals(id)) {
				return new ResponseEntity<User>(user,HttpStatus.OK);			
			}
		}
		return new ResponseEntity<User>(HttpStatus.BAD_REQUEST);
	}
	
}