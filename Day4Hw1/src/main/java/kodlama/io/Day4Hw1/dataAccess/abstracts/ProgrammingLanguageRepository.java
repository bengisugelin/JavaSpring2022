package kodlama.io.Day4Hw1.dataAccess.abstracts;

import java.util.List;

import kodlama.io.Day4Hw1.entities.concretes.ProgrammingLanguage;


public interface ProgrammingLanguageRepository {
	
	List<ProgrammingLanguage> getAll();

	void add(ProgrammingLanguage programmingLanguage);

	void delete(int id);

	void update(int id, String name);

	ProgrammingLanguage getById(int id);

}
