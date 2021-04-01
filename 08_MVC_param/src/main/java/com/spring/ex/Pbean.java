package com.spring.ex;

public class Pbean {
	private String id;
	private String pw;
	private String name;
	private String addr;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
		System.out.println("getId()");
	}
	public String getPw() {
		System.out.println("setId()");
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public Pbean(String id, String pw, String name, String addr) {
		super();
		
		System.out.println("Person(String id, String pw, String name, String addr");
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.addr = addr;
	}
	public Pbean() {
		super();
	}
	
	@Override
	public String toString() {
		return "Pbean [id="+id+" pw="+pw+" name="+name+" addr="+addr+"]";
	}
}
