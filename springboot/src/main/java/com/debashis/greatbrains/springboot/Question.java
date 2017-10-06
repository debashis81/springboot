package com.debashis.greatbrains.springboot;

import java.util.List;

public class Question {
	
	private String id;
	private String questionText;
	private List<String> answers;
	
	@Override
	public String toString() {
		
		String finalStringAnswers = "";
		Boolean flag = false;
		for(String eachAnswer : answers)
		{
			if (flag == false) {
			finalStringAnswers = eachAnswer;
			flag = true;
			}
			else
				finalStringAnswers +=  " , " + eachAnswer ;
		}
		
		return "Question [id=" + id + ", questionText=" + questionText + ", answers=" + finalStringAnswers + "]";
	}

	public Question(String id, String questionText, List<String> answers) {
		super();
		this.id = id;
		this.questionText = questionText;
		this.answers = answers;
	}

}
