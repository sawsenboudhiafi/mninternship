package com.talan.internship.servicesimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.talan.internship.model.Question;
import com.talan.internship.repositories.QuestionRepository;
import com.talan.internship.responses.MessageResponse;
import com.talan.internship.services.IQuestionService;


@Service
public class QuestionServiceImpl implements IQuestionService {

	@Autowired
	private QuestionRepository questionRepository;
	
	@Override
	public MessageResponse save(Question question) {
		questionRepository.save(question);
		return new MessageResponse(true, "succes", "Operation effectuée avec succes");
	}

	@Override
	public MessageResponse delete(Integer id) {

         questionRepository.deleteById(id);
         return new MessageResponse(true, "succes", "Operation effectuée avec succes");
	}

	@Override
	public MessageResponse update(Question question) {

        questionRepository.save(question);
		return new MessageResponse(true, "succes", "Operation effectuée avec succes");
	}

	@Override
	public List<Question> findAll() {
		
		return questionRepository.findAll();
	}

	@Override
	public Question findById(Integer id) {
		
		return questionRepository.findById(id).orElse(null);
	}

}
