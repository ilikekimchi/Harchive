package com.archive.ksh.service;

import java.util.List;

import com.archive.ksh.model.Ask;


public interface AskService {

	List<Ask> userAskList();
	
	void questionAdd(Ask item);
	
	List<Ask> adminAskList();

	void answerAdd(Ask item);

	void questionDelete(int askNum);

}
