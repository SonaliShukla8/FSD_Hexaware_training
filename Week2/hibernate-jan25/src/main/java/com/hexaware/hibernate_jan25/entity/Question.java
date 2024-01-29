package com.hexaware.hibernate_jan25.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name="question")
public class Question {
	@Id
	private int quesNumber;
	private String ques;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="ansNumber")
    private Answer answer;
	
	public Question() {
		super();

	}
	public Question(int quesNumber, String ques) {
		super();
		this.quesNumber = quesNumber;
		this.ques = ques;
		
	}

	public Question(int quesNumber, String ques, Answer answer) {
		super();
		this.quesNumber = quesNumber;
		this.ques = ques;
		this.answer = answer;
	}

	public int getQuesNumber() {
		return quesNumber;
	}

	public void setQuesNumber(int quesNumber) {
		this.quesNumber = quesNumber;
	}

	public String getQues() {
		return ques;
	}

	public void setQues(String ques) {
		this.ques = ques;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	
	
}
