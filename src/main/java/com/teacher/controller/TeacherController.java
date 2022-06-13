package com.teacher.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.teacher.entity.Teacher;
import com.teacher.service.TeacherService;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
	
	@Autowired
	private TeacherService teacherService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@GetMapping("/{cId}")
	public Teacher getTeacher(@PathVariable("cId") Long cId) {
		
		Teacher teacher = this.teacherService.getTeacher(cId);
		//http://localhost:9002/student/teacher/1315
		
		List students = this.restTemplate.getForObject("http://localhost:9002/student/teacher/" + cId, List.class);
		
		teacher.setStudents(students);
		
		return teacher;
		
	}
	

}
