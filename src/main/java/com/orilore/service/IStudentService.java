package com.orilore.service;

import java.util.List;

import com.orilore.model.Student;

public interface IStudentService {
	public List<Student> query();
	public void saves(List<Student> students);
}
