package kodlama.io.Day4Hw1.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Day4Hw1.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Day4Hw1.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Day4Hw1.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

	private ProgrammingLanguageRepository programmingLanguageRepository;

	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		super();
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		// business rules
		return programmingLanguageRepository.getAll();
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) throws Exception {
		if (isLanguageNameExists(programmingLanguage)) {
			throw new Exception("the language has already existed");
		}
		if (IsLanguageIdExist(programmingLanguage.getId())) {
			throw new Exception("the id has already existed");
		}

		programmingLanguageRepository.add(programmingLanguage);
	}

	@Override
	public void delete(int id) throws Exception {

		if (!IsLanguageIdExist(id)) {
			throw new Exception("Invalid Id");
		}

		programmingLanguageRepository.delete(id);

	}

	@Override
	public void update(int id, String name) throws Exception {
		if (!IsLanguageIdExist(id)) {
			throw new Exception("Invalid Id");
		}
		programmingLanguageRepository.update(id, name);

	}

	@Override
	public ProgrammingLanguage getById(int id) throws Exception  {
		if (!IsLanguageIdExist(id)) {
			throw new Exception("Invalid Id");
		}
		return programmingLanguageRepository.getById(id);

	}

	public boolean isLanguageNameExists(ProgrammingLanguage programmingLanguage) {
		boolean result = false;
		for (ProgrammingLanguage programmingLanguage2 : getAll()) {
			if (programmingLanguage.getName().equals(programmingLanguage2.getName())) {
				result = true;
			}
		}
		return result;
	}

	public boolean IsLanguageIdExist(int id) {
		boolean result = false;
		for (ProgrammingLanguage programmingLanguage2 : getAll()) {
			if (programmingLanguage2.getId() == id) {
				result = true;
			}
		}
		return result;
	}

}
