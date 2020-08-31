package com.boot.factory;

import com.boot.user.AdminUser;
import com.boot.user.CommonUser;
import com.boot.user.UserProduct;

public class UserFactoryImpl implements UserFactory{
	
	public UserFactoryImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public UserProduct getUserType(String userType) {
		// TODO Auto-generated method stub
		switch (userType) {
		case "admin":
			return new AdminUser();
		default:
			return new CommonUser();
		}
	}

}
