package com.bit.bnb.mypage.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bit.bnb.mypage.dao.HistoryDao;
import com.bit.bnb.mypage.model.HistoryVO;

@Service
public class HistoryViewService {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	private HistoryDao historyDao;
	
	public List<HistoryVO> historyView(String userId) {
		
		historyDao = sqlSessionTemplate.getMapper(HistoryDao.class);
		
		return historyDao.historyList(userId);
		
	}

}