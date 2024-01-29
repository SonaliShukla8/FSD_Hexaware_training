package com.hexaware.hibernate_jan25.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name = "answer")
public class Answer {
	@Id
    private int ansNumber;
    private String answer;
    @OneToOne(mappedBy="answer" , cascade=CascadeType.ALL )
    private Question question;
	
    public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
    public Answer(int ansNumber, String answer) {
		super();
		this.ansNumber = ansNumber;
		this.answer = answer;
		
	}

	public Answer(int ansNumber, String answer, Question question) {
		super();
		this.ansNumber = ansNumber;
		this.answer = answer;
		this.question = question;
	}

	public int getAnsNumber() {
		return ansNumber;
	}

	public void setAnsNumber(int ansNumber) {
		this.ansNumber = ansNumber;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}
    
	
    
}
