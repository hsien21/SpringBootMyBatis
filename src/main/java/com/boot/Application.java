package com.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.boot.factory.UserFactory;
import com.boot.factory.UserFactoryImpl;
import com.boot.user.UserProduct;

@EnableTransactionManagement
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@MapperScan("com.boot.dao")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		UserFactory userFactory = new UserFactoryImpl();
		
		UserProduct adminProduct = userFactory.getUserType("jfdf");
		
		adminProduct.setUserProduct();
		
	}

}
