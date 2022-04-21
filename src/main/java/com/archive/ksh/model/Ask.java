package com.archive.ksh.model;

import java.time.format.DateTimeFormatter;

public class Ask {
	
	private int askNum;
	private String question;
	private String answer;
	//DateTimeFormatter time = DateTimeFormatter.ofPattern("yy.MM.dd");

	public int getAskNum() {
		return askNum;
	}

	public void setAskNum(int askNum) {
		this.askNum = askNum;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

//	public DateTimeFormatter getTime() {
//		return time;
//	}
//
//	public void setTime(DateTimeFormatter time) {
//		this.time = time;
//	}

}
