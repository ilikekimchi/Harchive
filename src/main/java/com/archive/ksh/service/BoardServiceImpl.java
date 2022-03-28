package com.archive.ksh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.archive.ksh.dao.BoardDao;
import com.archive.ksh.model.Board;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardDao boardDao;
	
	@Override
	public List<Board> selectBoardList() {
		return boardDao.selectBoardList();
	}

}
