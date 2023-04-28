package com.masai.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
		
		return null;
	}

	@Override
	public User getUser(String userId) {
		
		return null;
	}

	@Override
	public User updateUserDetails(User user) {
		
		return null;
	}

	@Override
	public User deleteUserDetails(String id) {
		
		return null;
	}

}
