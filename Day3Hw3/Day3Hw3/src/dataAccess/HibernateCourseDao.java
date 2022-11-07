package dataAccess;

import java.util.List;

import entities.Course;

public class HibernateCourseDao implements CourseDao {
	public void add(Course course) {
		System.out.println("Added to the database (Hibernate)");
		
	}



}
