package com.archive.ksh.model;

import java.sql.Date;

public class Post {

	private int postid;
	private String title;
	private String content;
	private int tag;
	private int count;
	private Date date;

	public int getPostid() {
		return postid;
	}
	public void setPostid(int postid) {
		this.postid = postid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public int getTag() {
		return tag;
	}
	public void setTag(int tag) {
		this.tag = tag;
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

	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
