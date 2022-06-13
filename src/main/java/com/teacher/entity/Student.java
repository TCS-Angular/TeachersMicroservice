package com.teacher.entity;

public class Student {
	
	private long sId;
	private String email;
	private String studentName;
	private Long cId;
	public Student(long sId, String email, String studentName, Long cId) {
		super();
		this.sId = sId;
		this.email = email;
		this.studentName = studentName;
		this.cId = cId;
	}
	public Student() {
		super();
	}
	public long getsId() {
		return sId;
	}
	public void setsId(long sId) {
		this.sId = sId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Long getcId() {
		return cId;
	}
	public void setcId(Long cId) {
		this.cId = cId;
	}
	
	

}
