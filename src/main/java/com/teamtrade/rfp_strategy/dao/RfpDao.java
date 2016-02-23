package com.teamtrade.rfp_strategy.dao;

import java.util.List;

import com.teamtrade.rfp_strategy.model.Rfp;

public interface RfpDao {	
	Rfp findRfpById(int id);
	List<Rfp> findAllRfp();
}
