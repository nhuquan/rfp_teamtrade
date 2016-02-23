package com.teamtrade.rfp_strategy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.teamtrade.rfp_strategy.dao.RfpDao;
import com.teamtrade.rfp_strategy.model.Rfp;

@Service("rfpService")
@Transactional
public class RfpServiceImpl implements RfpService {

	@Autowired
	private RfpDao dao;
	
	public Rfp findById(int id) {	
		return dao.findRfpById(id);
	}

	public List<Rfp> findAllRfp() {		
		return dao.findAllRfp();
	}


}
