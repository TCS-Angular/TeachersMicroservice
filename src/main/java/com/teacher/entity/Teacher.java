package com.teacher.entity;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
	
	private Long cId;
	private String name;
	private String subject;
	
	List<Student> students = new ArrayList<>();

	public Teacher(Long cId, String name, String subject, List<Student> students) {
		super();
		this.cId = cId;
		this.name = name;
		this.subject = subject;
		this.students = students;
	}

	public Teacher(Long cId, String name, String subject) {
		super();
		this.cId = cId;
		this.name = name;
		this.subject = subject;
	}

	public Teacher() {
		super();
	}

	public Long getcId() {
		return cId;
	}

	public void setcId(Long cId) {
		this.cId = cId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	
	

}
