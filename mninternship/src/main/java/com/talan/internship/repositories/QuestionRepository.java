package com.talan.internship.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.talan.internship.model.Question;

public interface QuestionRepository extends JpaRepository<Question,Integer> {

}
