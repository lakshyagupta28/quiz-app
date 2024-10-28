package com.example.quizapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    public String questionTitle;
    // In sql we use snake casing but in java we use camel casing
    public String option1;
    public String option2;
    public String option3;
    public String option4;
    public String rightAnswer;
    public String difficultyLevel;
    public String category;

}
