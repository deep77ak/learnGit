package com.spBoot.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spBoot.app.Entity.Course;
import com.spBoot.app.Service.ServiceImpl;

@RestController
public class Controller {
	@Autowired
	private ServiceImpl impl;
	
	@GetMapping("/course")
	public List<Course> getCourses() {
		return impl.getCourses();
	}
	
	@GetMapping("/course/{id}")
	public Course getCourse(@PathVariable String id) {
		return impl.getCourse(Long.parseLong(id));
	}
	
	@PostMapping("/course")
	public Course addCourse(@RequestBody  Course course) {
		return impl.addCourse(course);
	}
	
	@PutMapping("/course/{id}")
	public Course updateCourse(@RequestBody Course course) {
		return impl.updateCourse(course);
	}

	@DeleteMapping("/course/{id}")
	public void deleteCourse(@PathVariable String id) {
		impl.deleteCourse(Long.parseLong(id));
	}
	
}
