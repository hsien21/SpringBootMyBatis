package com.boot.bean;

public class User {
	private int id;
	private String name;
	private int age;
	
	
	public User(){
	 }
	 /**
	  *  构造方法
	  * @param id  编号
	  * @param name  姓名
	  */
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
