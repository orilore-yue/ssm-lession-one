package com.orilore.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.orilore.mapper.StudentMapper;
import com.orilore.model.Student;

@Service
public class StudentService implements IStudentService {
	@Resource
	private StudentMapper mapper;
	
	@Override
	public List<Student> query() {
		return this.mapper.select();
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void saves(List<Student> students) {
		for (Student bean : students) {
			this.mapper.insert(bean);
		}
	}

}
