package com.teamtrade.rfp_strategy.dao;

import java.util.List;

import com.teamtrade.rfp_strategy.model.Relation;

public interface RelationDao {
	Relation findById(int id);
	  
    void saveRelation(Relation relation);
     
    void deleteRelationById(int id);
     
    List<Relation> findAllRelation();
 
  
}
