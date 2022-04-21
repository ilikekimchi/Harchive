package com.archive.ksh.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.archive.ksh.model.Ask;

@Repository
public class AskDaoImpl implements AskDao {
	
	@Autowired
	SqlSession sql;
	
	@Override
	public List<Ask> askList() {
		return sql.selectList("ask.list");
	}
	
	@Override
	public void questionAdd(Ask item) {
		sql.insert("ask.questionAdd", item);
	}

	@Override
	public void answerAdd(Ask item) {
		
		sql.update("ask.answerAdd", item);
	}

	@Override
	public void questionDelete(int askNum) {
		sql.delete("ask.questionDelete", askNum);
		
	}

}
