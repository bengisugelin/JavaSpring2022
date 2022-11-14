package kodlama.io.Day4Hw1.business.abstracts;

import java.util.List;

import kodlama.io.Day4Hw1.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {
	List<ProgrammingLanguage> getAll();
	
	void add(ProgrammingLanguage programmingLanguage) throws Exception;
	void delete(int id) throws Exception;
	void update( int id, String name) throws Exception;
	ProgrammingLanguage getById(int id) throws Exception;

}
