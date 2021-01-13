package com.cooksys.quizapi.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Quiz {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;

}
