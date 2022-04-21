package com.archive.ksh.service;

import java.util.List;

import com.archive.ksh.model.Ask;


public interface AskService {

	void questionAdd(Ask item);

	List<Ask> askList();

	void answerAdd(Ask item);

	void questionDelete(int askNum);

}
