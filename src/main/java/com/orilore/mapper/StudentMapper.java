package com.orilore.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.orilore.model.Student;

@Mapper
public interface StudentMapper {
	public List<Student> select();
	public void insert(Student bean);
}
