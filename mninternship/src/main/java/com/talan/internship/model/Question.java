package com.talan.internship.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Question {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String description;
	private String category;
	private boolean published;
	
}