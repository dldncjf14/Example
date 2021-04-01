package com.spring.ex.dto;

public class PDto {
	private int num;
	private String id;
	private String name;
	private String age;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public PDto(int num, String id, String name, String age) {
		super();
		this.num = num;
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public PDto() {
		super();
	}
	
	
	
	
}
