package com.student.result.studentMVCspringboot;

public class Student {
	private int id;
	private String percent;
	private String grade;
	public Student() {}
	public Student(int id, String percent, String grade) {
		super();
		this.id = id;
		this.percent = percent;
		this.grade = grade;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPercent() {
		return percent;
	}
	public void setPercent(String percent) {
		this.percent = percent;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
}
