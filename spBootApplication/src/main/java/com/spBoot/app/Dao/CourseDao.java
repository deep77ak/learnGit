package com.spBoot.app.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spBoot.app.Entity.Course;

@Repository
public interface CourseDao extends JpaRepository<Course, Long>{

}
