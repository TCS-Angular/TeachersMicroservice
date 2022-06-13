package com.teacher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teacher.entity.Teacher;
import com.teacher.service.TeacherService;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
	
	@Autowired
	private TeacherService teacherService;
	
	
	@GetMapping("/{cId}")
	public Teacher getTeacher(@PathVariable("cId") Long cId) {
		return this.teacherService.getTeacher(cId);
		
	}
	

}
