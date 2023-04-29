package com.masai.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.UserNotFoundExceptation;
import com.masai.model.User;
import com.masai.repositories.UserRepositories;
import com.masai.services.UserServices;

@Service
public class UserServicesImpl implements UserServices {
	
	@Autowired
	private UserRepositories dao;
	

	@Override
	public User createUser(User user) {
		
		User saveUser= dao.save(user);
		
		return saveUser;
	}


	@Override
	public List<User> gatAllUser() {
		return dao.findAll();
	}


	@Override
	public User getUser(String userId) {
		// TODO Auto-generated method stub
		return dao.findById(userId).orElseThrow(()-> new UserNotFoundExceptation("User Not found by givin id : "+userId));
	}


	@Override
	public User updateUserDetails(User user) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public User deleteUserDetails(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
