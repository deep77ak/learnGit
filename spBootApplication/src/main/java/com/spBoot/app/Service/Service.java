package com.spBoot.app.Service;

import java.util.List;

import com.spBoot.app.Entity.Course;

public interface Service {
	
	public List<Course> getCourses();
	
	
	public Course getCourse(long id);
	
	
	public Course addCourse(Course course);
	
	
	public Course updateCourse(Course course);
	
	
	public void deleteCourse(long parseLong);

}
