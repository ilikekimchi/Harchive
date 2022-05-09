package com.archive.ksh.dao;

import java.util.List;

import com.archive.ksh.model.Post;

public interface PostDao {

	void postAdd(Post item);

	Post getPostInfo(int postid);

	List<Post> postList();

	void postModify(Post item);

	

}