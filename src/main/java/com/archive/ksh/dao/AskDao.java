package com.archive.ksh.dao;

import java.util.List;

import com.archive.ksh.model.Ask;

public interface AskDao {
	
	List<Ask> userAskList();

	void questionAdd(Ask item);

	List<Ask> adminAskList();

	void answerAdd(Ask item);

	void questionDelete(int askNum);

}
