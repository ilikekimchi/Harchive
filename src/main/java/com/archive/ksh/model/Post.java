package com.archive.ksh.model;

import java.sql.Date;

public class Post {

	private int num; // �⺻Ű 
	private String title; // ����
	private String content; // ����
	private int count; // ��ȸ��
	private Date add_date; // �ۼ���
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Date getAdd_date() {
		return add_date;
	}
	public void setAdd_date(Date add_date) {
		this.add_date = add_date;
	}
	
	
}
