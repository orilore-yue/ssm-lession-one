package com.orilore.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.orilore.model.Student;
import com.orilore.service.IStudentService;

@Controller
public class StudentCtrl {
	@Resource
	private IStudentService service;
	@RequestMapping("/students.do")
	public String list(Model model){
		List<Student> list = this.service.query();
		model.addAttribute("students", list);
		return "students";
	}
	@RequestMapping("/saves.do")
	public String saves(){
		List<Student> students = new ArrayList<Student>();
		Student s1 = new Student();
		s1.setName("王麻子");
		Student s2 = new Student();
		s2.setName("张麻子");
		Student s3 = new Student();
		s3.setName("李麻子");
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		this.service.saves(students);
		return "redirect:/students.do";
	}
}
