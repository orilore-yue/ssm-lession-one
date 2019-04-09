package com.orilore.controller;

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
	
	@RequestMapping("/show.do")
	public String show(){
		return "regist";
	}
	
	@RequestMapping("/save.do")
	public String save(Student bean){
		this.service.save(bean);
		return "redirect:/students.do";
	}
}
