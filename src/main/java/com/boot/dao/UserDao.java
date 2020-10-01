package com.boot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.boot.bean.User;

@Mapper
public interface UserDao {
	
	@Insert("insert into t_user(id,name,age) values (#{id},#{name},#{age})")
	void addUser(User user);
	
	@Update("update t_user set name=#{name},age=#{age} where id=#{id}")
	void updateUser(User user);
	
	@Delete("delete from t_user where id=#{id}")
	void deleteUser(int id);
	
	@Select("select id,name,age from t_user where name=#{userName}")
	User findByName(@Param("userName") String userName);
	
	@Select("select id,name,age from t_user")
	List<User> findAll();
	
}
