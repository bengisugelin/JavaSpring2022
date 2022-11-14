package kodlama.io.Day4Hw1.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Day4Hw1.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Day4Hw1.entities.concretes.ProgrammingLanguage;

@RestController //annotation
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguagesController {
	private ProgrammingLanguageService programmingLanguageService;

	@Autowired
	public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
		this.programmingLanguageService = programmingLanguageService;
	}
	
	@GetMapping("/getAll") 
	public List<ProgrammingLanguage> getAll(){
		return programmingLanguageService.getAll();		
	}
	
	@GetMapping("/add") 
	public void add(ProgrammingLanguage programmingLanguage) throws Exception{
		programmingLanguageService.add(programmingLanguage);		
	}
	
	@GetMapping("/delete") 
	public void delete(int id) throws Exception{
		programmingLanguageService.delete(id);		
	}
	
	@GetMapping("/update") 
	public void update(int id, String name) throws Exception{
		programmingLanguageService.update(id, name);		
	}
	
	public ProgrammingLanguage getById(int id) throws Exception{
		return programmingLanguageService.getById(id);		
	}
	
	

}
