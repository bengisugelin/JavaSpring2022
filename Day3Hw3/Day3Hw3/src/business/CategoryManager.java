package business;

import java.util.List;

import core.logging.Logger;
import dataAccess.CategoryDao;
import entities.Category;
import entities.Course;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	private List<Category> categories;
	
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers, List<Category> categories) {
		super();
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = categories;
	}
	
	public void add(Category category) throws Exception {
		for (Category category1 : categories) {
			if (category.getCategoryName().equals(category1.getCategoryName())) {
				throw new Exception("You already have a course with the same name.");
			}
		}

		categoryDao.add(category);
		categories.add(category);
		for (Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}
	
	
}


	
	
}
