package com.boot.demo;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import com.boot.bean.User;
import com.boot.dao.UserDao;
import com.boot.service.UserService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserApplicationTests {
	
	@Autowired
	private UserService userService;
	
	@MockBean
	private UserDao userDao;
	
	@Test
	public void getFindAllUsers() {
		System.out.println("---------------測試開始---------------");
		User user = userService.findUserByName("jack");
		
		Assert.notNull(user);
	}
	
	@Test
	public void contextLoads() {
		System.out.println("---------------JackTest---------------");
	}
}
