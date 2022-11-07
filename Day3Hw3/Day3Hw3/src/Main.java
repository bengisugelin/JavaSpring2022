import java.util.ArrayList;
import java.util.List;

import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.HibernateCategoryDao;
import dataAccess.HibernateCourseDao;
import dataAccess.HibernateInstructorDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		/*
		 * kodlama.io web sitesinin ana sayfasında bulunan eğitmen, kategori ve kurs
		 * bölümlerini katmanlı mimaride kodlamak istiyoruz.
		 * 
		 * Önceki derste yaptığımız tekniklerle hem jdbc hem de hibernate üzerinde
		 * yazmış gibi simüle ediniz.
		 * 
		 * Çoklu loglama yapısını simule ediniz.
		 * 
		 * Aşağıdaki isterleri gerçekleştiriniz.
		 * 
		 * Kurs ismi tekrar edemez Kategori ismi tekrar edemez Bir kursun fiyatı 0 dan
		 * küçük olamaz
		 */
		
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		
		
		//codes for Instructor 
		Instructor instructor1 = new Instructor(1, "Bengisu");		
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(),  loggers);
		instructorManager.add(instructor1);
		
		
		//codes for Courses
		List<Course> courses = new ArrayList<>();
		Course course = new Course(1, "JavaCamp", 3000);
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(),loggers, courses);
		courseManager.add(course);
		
//		Course course1 = new Course(1, "JavaCamp", 3000);  // -- Checked if exception works.
//		courseManager.add(course1);
		
		//Codes for Category
		List<Category> categories = new ArrayList<>();
		Category category = new Category(1, "Programming for Beginners");
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers, categories);
		categoryManager.add(category);
		
//		Category category1 =new Category(1, "Programming for Beginners"); // -- Checked if exception works.
//		categoryManager.add(category1);
		
		
		

		


	}

}
