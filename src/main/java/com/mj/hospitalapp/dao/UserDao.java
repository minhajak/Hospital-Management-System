package com.mj.hospitalapp.dao;

import java.util.List;

import com.mj.hospitalapp.dto.User;

public interface UserDao {
	
	User saveUser(User user);

	boolean deleteUserById(int uid);

	User updateUserById(int uid,User user);

	User getUserById(int uid);

	List<User> getAllUsers();

	List<User> getUserByRole(String role);
}
