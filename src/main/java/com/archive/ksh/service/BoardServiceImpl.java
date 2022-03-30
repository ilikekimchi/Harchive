package com.archive.ksh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.archive.ksh.dao.BoardDao;
import com.archive.ksh.model.Board;
import com.archive.ksh.model.Item;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardDao dao;
	
	@Override
	public List<Board> selectBoardList() {
		return dao.selectBoardList();
	}

	@Override
	public void add(Item item) {
		dao.add(item);
		
	}

}
