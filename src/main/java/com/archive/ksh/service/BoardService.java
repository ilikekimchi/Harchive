package com.archive.ksh.service;

import java.util.List;

import com.archive.ksh.model.Board;
import com.archive.ksh.model.Item;

public interface BoardService {

	List<Board> selectBoardList();

	void add(Item item);

}
