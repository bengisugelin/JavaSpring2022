package business;

import core.logging.Logger;
import dataAccess.InstructorDao;
import entities.Instructor;

public class InstructorManager {
	private InstructorDao instructorDao;
	private Logger[] loggers;

	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}

	public void add(Instructor instructor) throws Exception {
		// business rules.

//		if (instructor.getName().equals(instructor)) {
//			throw new Exception("You've already have an instructor with this name.");
//		}

		instructorDao.add(instructor);

		for (Logger logger : loggers) {
			logger.log(instructor.getName());
		}
	}

}
