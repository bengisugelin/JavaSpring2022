package dataAccess;

import entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{
	
	public void add(Instructor instructor) {
		System.out.println("Added to the database (JDBC)");
		
	}

}
