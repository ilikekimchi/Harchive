package com.archive.ksh.dao;

import java.util.List;

import com.archive.ksh.model.Board;
import com.archive.ksh.model.Item;

public interface BoardDao {

	List<Board> selectBoardList();

	void add(Item item);

}
