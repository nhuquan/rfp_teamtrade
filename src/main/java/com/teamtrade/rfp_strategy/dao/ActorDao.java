package com.teamtrade.rfp_strategy.dao;

import java.util.List;

import com.teamtrade.rfp_strategy.model.Actor;

public interface ActorDao {
		
	Actor findById(int id);
	  
	void saveActor(Actor person);
	     
	void deleteActorBySsn(String ssn);
	     
	List<Actor> findAllActor();
	 
	    
}
