package com.student.result.studentMVCspringboot;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Component;



@Component
public class StudentDao {

	private static List<Student> users = new ArrayList<>();

	static {
		users.add(new Student(8001, "70%","B"));
		users.add(new Student(8002, "82%","A"));
		users.add(new Student(8003, "93%","Ex"));
	}
	public Student findOne(int id) {
		for (Student user : users) {
			if (user.getId() == id) {
				return user;
			}
		}
		return null;
	}
}
