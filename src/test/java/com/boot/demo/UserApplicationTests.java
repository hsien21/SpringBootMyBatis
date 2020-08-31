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
import com.sun.research.ws.wadl.Method;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserApplicationTests {
	
	@Autowired
	private UserService userService;
	
	@MockBean
	private UserDao userDao;
	
	@Test
	public void  insertTest() {
		// TODO Auto-generated method stub
		System.out.println("---------------測試寫入開始---------------");
		Method1();
		User user = new User();
		user.setAge(20);
		user.setName("Cindy");
		boolean addUser = userService.addUser(user);
		System.out.println("---------addUser-------"+addUser);
	}
	
	public void Method1() {
		User user = new User();
		user.setId(1);
		user.setAge(20);
		user.setName("Jack");
		boolean addUser = userService.addUser(user);
		System.out.println("---------addUser-------"+addUser);
		if (true) {
			throw new RuntimeException("------異常---------");
		}
	}
	
	@Test
	public void getFindAllUsers() {
		System.out.println("---------------測試開始---------------");
		User user = userService.findUserByName("jack");
		System.out.println(user);
		
		Assert.notNull(user);
		
	}
	
	@Test
	public void contextLoads() {
		System.out.println("---------------JackTest---------------");
	}
}
