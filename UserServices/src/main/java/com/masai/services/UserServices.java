package com.masai.services;

import java.util.List;

import com.masai.exception.UserNotFoundExceptation;
import com.masai.model.User;

public interface UserServices {
	
	//USER OPERATATION
	
	//1. create
	public User createUser(User user);
	
	//2. get all user
	public List<User> gatAllUser();	
	
	//3. get single user of giving id
	public User getUser(String userId);
	
	
	//4. Update User Details
	public User updateUserDetails(User user);
	
	//5. delete user Details
	public User deleteUserDetails(String id);


	

}
