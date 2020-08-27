package com.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.bean.User;
import com.boot.dao.UserDao;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		boolean flag = false;
		try {
			System.out.println(user.getId());
			System.out.println(user.getName());
			System.out.println(user.getAge());
			userDao.addUser(user);
			flag = true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		boolean flag = false;
		try {
			userDao.updateUser(user);
			flag = true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public boolean deleteUser(int id) {
		// TODO Auto-generated method stub
		boolean flag = false;
		try {
			userDao.deleteUser(id);
			flag = true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public User findUserByName(String userName) {
		// TODO Auto-generated method stub
		System.out.println("Service: "+userName);
		return userDao.findByName(userName);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

}
