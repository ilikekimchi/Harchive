package com.archive.ksh.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.archive.ksh.model.Board;
import com.archive.ksh.model.Item;

@Repository
public class BoardDaoImpl implements BoardDao {

	@Autowired
	SqlSession sql;
	
	@Override
	public List<Board> selectBoardList() {
		
		return sql.selectList("board.list");
	}

	@Override
	public void add(Item item) {
		System.out.println(item.getTitle());
		sql.insert("board.add", item);
		
	}

}
