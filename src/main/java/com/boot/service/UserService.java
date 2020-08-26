package com.boot.service;

import java.util.List;

import com.boot.bean.User;

public interface UserService {
	
	boolean addUser(User user);
	
	boolean updateUser(User user);
	
	boolean deleteUser(int id);
	
	User findUserByName(String userName);
	
	List<User> findAll();

}
