package com.boot.factory;


import com.boot.user.UserProduct;

public interface UserFactory {
	public UserProduct getUserType(String userType);
}
