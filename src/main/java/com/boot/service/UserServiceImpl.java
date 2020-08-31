package com.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.object.UpdatableSqlQuery;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.boot.bean.User;
import com.boot.dao.UserDao;
import com.boot.factory.UserFactory;
import com.boot.factory.UserFactoryImpl;
import com.boot.user.AdminUser;
import com.boot.user.UserProduct;

@Service

public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;

	@Override
	@Transactional
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		boolean flag = false;			
		userDao.addUser(user);
		flag = true;
			
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
		// TODO Auto-generated  method stub
		return userDao.findAll();
	}
	
	

}
