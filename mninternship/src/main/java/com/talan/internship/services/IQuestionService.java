package com.talan.internship.services;

import java.util.List;
import com.talan.internship.model.Question;
import com.talan.internship.responses.MessageResponse;



public interface IQuestionService {

	public MessageResponse save(Question question);
	public MessageResponse delete(Integer id);
	public MessageResponse update(Question question);
	public List<Question> findAll();
	public Question findById(Integer id );
	
}
