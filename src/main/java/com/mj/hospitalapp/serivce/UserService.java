package com.mj.hospitalapp.serivce;

import java.util.List;

import com.mj.hospitalapp.dao.UserDao;
import com.mj.hospitalapp.dao.imp.UserDaoImp;
import com.mj.hospitalapp.dto.User;

public class UserService {
	UserDao daoImp = new UserDaoImp();
	public void saveUser(User user) {
		User user1 =  daoImp.saveUser(user);
		if (user1 != null) {
			System.out.println("user data saved successfully");
		} else {
			System.out.println("failed to delete user data ");
		}
	}
	public void deleteUser(int uid) {
		boolean flag = daoImp.deleteUserById(uid);
		if (flag) {
			System.out.println("user data deleted succesfully");
		} else {
			System.out.println(" failed to delete user data");
		}
	}
	public User updateUser(int uid,User user) {
		User user1 = daoImp.updateUserById(uid, user);
		if (user1 != null) {
			System.out.println("person data updated successfully");
			return user1;
		} else {
			System.out.println("failed to update user data");
			return null;
		}
	}
	public User getUserById(int uid) {
		User user = daoImp.getUserById(uid);
		if(user!=null) {
			return user;
		}
		else {
			return null;
		}
	}
	public List<User> getAllUser(){
		List<User> users = daoImp.getAllUsers();
		if(users!=null) {
			return users;
		}
		else {
			return null;
		}
	}
	public List<User> getUserByRole(String role){
		List<User> users = daoImp.getUserByRole(role);
		if(users!=null) {
			return users;
		}
		else {
			return null;
		}
	}
	
	
}

