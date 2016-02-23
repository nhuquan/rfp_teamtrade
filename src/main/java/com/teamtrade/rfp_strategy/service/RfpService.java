package com.teamtrade.rfp_strategy.service;

import java.util.List;

import com.teamtrade.rfp_strategy.model.Rfp;

public interface RfpService {	 
	
	Rfp findById(int id) ;		
	List<Rfp> findAllRfp();
 }
