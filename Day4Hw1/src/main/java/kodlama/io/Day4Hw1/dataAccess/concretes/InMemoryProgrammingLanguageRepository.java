package kodlama.io.Day4Hw1.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Day4Hw1.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Day4Hw1.entities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {

	List<ProgrammingLanguage> languages;
	
	
	public InMemoryProgrammingLanguageRepository() {
		languages = new ArrayList<ProgrammingLanguage>();
		languages.add(new ProgrammingLanguage(1, "C#" ));
		languages.add(new ProgrammingLanguage(2, "Java" ));
		languages.add(new ProgrammingLanguage(3, "Python" ));
	}


	@Override
	public List<ProgrammingLanguage> getAll() {
		
		return languages;
	}


	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		languages.add(programmingLanguage);
		
	}


	@Override
	public void delete(int id) {
		languages.remove(id);
		
	}


	@Override
	public void update(int id, String name) {
		languages.get(id).setName(name);
		
	}


	@Override
	public ProgrammingLanguage getById(int id) {
		// TODO Auto-generated method stub
		return languages.get(id);
	}

}
