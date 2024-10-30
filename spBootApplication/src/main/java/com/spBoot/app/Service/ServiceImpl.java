package com.spBoot.app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.spBoot.app.Dao.CourseDao;
import com.spBoot.app.Entity.Course;


@org.springframework.stereotype.Service
public class ServiceImpl implements Service{
	
	@Autowired
	private CourseDao courseDao;

	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(long id) {
		
		return courseDao.getOne(id);
	}

	@Override
	public Course addCourse(Course course) {
		
		return courseDao.save(course);
	}

	@Override
	public Course updateCourse(Course course) {
		
		return courseDao.save(course);
	}

	@Override
	public void deleteCourse(long parseLong) {
		
		
		Course entity=courseDao.getOne(parseLong);
		courseDao.delete(entity);
	}

}
