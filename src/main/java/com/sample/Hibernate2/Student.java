package com.sample.Hibernate2;

public class Student {
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int id;
	private String name;
	private String subject;
	
	
	
	public Student(int id, String name, String subject) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
	}
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
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
	

}
