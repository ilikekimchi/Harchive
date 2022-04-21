package com.archive.ksh.dao;

import java.util.List;

import com.archive.ksh.model.Ask;

public interface AskDao {

	void questionAdd(Ask item);

	List<Ask> askList();

	void answerAdd(Ask item);

	void questionDelete(int askNum);

}
