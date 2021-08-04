package com.talan.internship.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.talan.internship.model.Question;
import com.talan.internship.responses.MessageResponse;
import com.talan.internship.servicesimpl.QuestionServiceImpl;
@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class QuestionController {

	@Autowired
	private QuestionServiceImpl questionServiceImpl;
	
	
	@GetMapping("/questions")
	public List<Question> getAllQuestions() {
		
			return questionServiceImpl.findAll();
			
		
	}

	@GetMapping("/questions/{id}")
	public Question getQuestionById(@PathVariable("id") Integer id) {
		
			
			return questionServiceImpl.findById(id);
		
	}
	
	
	@PostMapping("/save")
	public MessageResponse saveQuestion(@RequestBody Question question) {
		return questionServiceImpl.save(question);
	}
	@PutMapping("update")
	public MessageResponse update(@RequestBody Question question) {
		
		return questionServiceImpl.update(question);
			
	}
	
	
	@DeleteMapping("/{ids}")
	public MessageResponse delete(@PathVariable("ids") Integer id) {
		
		return questionServiceImpl.delete(id);
		
	}
}