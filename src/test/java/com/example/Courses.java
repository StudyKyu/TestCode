package com.example;

import java.util.List;

public class Courses {
	private final List<Course> courses;

	public Courses(List<Course> courses) {
		this.courses = courses;
	}
	
	public double multiplyCreditAndCourseGrade() {
		
		return courses.stream().mapToDouble(Course::multiplyCreditAndCourseGrade).sum();
		
//		double multipliedCreditAndCourseGrade = 0;
//		for(Course course : courses) {
//			multipliedCreditAndCourseGrade += course.multiplyCreditAndCourseGrade();
//		}
//		return multipliedCreditAndCourseGrade;
	}

	public int calculateTotalCompletedCredit() {
		int totalCompletedCredit = courses.stream().mapToInt(course -> course.getCredit()).sum();
		
		return totalCompletedCredit;
	}

	
}
