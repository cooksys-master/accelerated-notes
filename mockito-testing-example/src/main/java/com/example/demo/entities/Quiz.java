package com.example.demo.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.UniqueConstraint;

@Entity
@Data
@NoArgsConstructor
public class Quiz {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

}
