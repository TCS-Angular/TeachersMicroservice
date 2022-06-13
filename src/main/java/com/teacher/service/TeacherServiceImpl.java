package com.teacher.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.teacher.entity.Teacher;

@Service
public class TeacherServiceImpl implements TeacherService {

	//fake teachers list 
	
	
	List<Teacher> list = List.of(
			new Teacher(1311L,"Mr James", "Maths"),
			new Teacher(1312L,"Mr Peter", "English"),
			new Teacher(1313L,"Mrs Suzan", "Biology"),
			new Teacher(1314L,"Mrs Ana", "Physics"),
			new Teacher(1315L,"Mr Thomas", "Chemistry")
			);

	@Override
	public Teacher getTeacher(Long id) {
		// TODO Auto-generated method stub
		return this.list.stream().filter(teacher -> teacher.getcId().equals(id)).findAny().orElse(null);
	}

}
