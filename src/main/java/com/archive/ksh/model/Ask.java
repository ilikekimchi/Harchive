package com.archive.ksh.model;

import java.util.Date;

public class Ask {
	
	private String AccessId;
	private String writer;
	private String question;
	private String answer;
	private Date dateTime;
	
	public String getAccessId() {
		return AccessId;
	}
	public void setAccessId(String accessId) {
		AccessId = accessId;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
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
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	
}
