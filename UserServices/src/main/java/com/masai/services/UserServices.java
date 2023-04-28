package com.masai.services;

import java.util.List;

import com.masai.model.User;

public interface UserServices {
	
	//USER OPERATATION
	
	//create
	public User createUser(User user);
	
	//get all user
	public List<User> gatAllUser();	
	
	//get single user of giving id
	public User getUser(String userId);
	
	
	//Update User Details
	public User updateUserDetails(User user);
	
	//delete user Details
	public User deleteUserDetails(String id);
	
	

}
