package com.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.boot.bean.User;
import com.boot.service.UserService;

@RestController
@RequestMapping(value = "/api/user")
public class UserRestController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/user",method = RequestMethod.POST)
	public boolean addUser(User user) {
		System.out.println("開始新增");
		return userService.addUser(user);
	}
	
	@RequestMapping(value = "/user",method = RequestMethod.PUT)
	public boolean updateUser(User user) {
		System.out.println("開始更新");
		return userService.addUser(user);
	}
	
	@RequestMapping(value = "/user",method = RequestMethod.DELETE)
	public boolean deleteUser(@RequestParam(value = "userName",required = true) int userId) {
		System.out.println("開始刪除");
		return userService.deleteUser(userId);
	}
	
	@RequestMapping(value = "/user",method = RequestMethod.GET)
	public User findByUserName(@RequestParam(value = "userName",required = true
	)String userName) {
		System.out.println("開始查詢");
		return userService.findUserByName(userName);
	}
	
	@RequestMapping(value = "/userAll",method = RequestMethod.GET)
	public List<User> findByUserAge() {
		System.out.println("開始查詢全部");
		return userService.findAll();
	}
}
