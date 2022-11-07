package business;

import java.util.List;

import core.logging.Logger;
import dataAccess.CourseDao;
import entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	private List<Course> courses;


	public CourseManager(CourseDao courseDao, Logger[] loggers, List<Course> courses) {
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courses;
	}

	public void add(Course course) throws Exception {

		if (course.getCoursePrice() < 0) {
			throw new Exception("Course price cannot be less than 0");
		}

		for (Course course1 : courses) {
			if (course.getName().equals(course1.getName())) {
				throw new Exception("You already have a course with the same name.");
			}
		}

		courseDao.add(course);
		courses.add(course);
		for (Logger logger : loggers) {
			logger.log(course.getName());
		}
	}

	
}
