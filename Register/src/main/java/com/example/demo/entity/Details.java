package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Details {
@Id
	
	private int studentid;
	private String name;
	private int age;
	private String course;
	private String courseDuration;
	private String courseTiming;
	private long phoneNumber;
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}
	public String getCourseTiming() {
		return courseTiming;
	}
	public void setCourseTiming(String courseTiming) {
		this.courseTiming = courseTiming;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Details(int studentid, String name, int age, String course, String courseDuration, String courseTiming,
			long phoneNumber) {
		super();
		this.studentid = studentid;
		this.name = name;
		this.age = age;
		this.course = course;
		this.courseDuration = courseDuration;
		this.courseTiming = courseTiming;
		this.phoneNumber = phoneNumber;
	}
	public Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
	