package com.teamtrade.rfp_strategy.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.teamtrade.rfp_strategy.model.Rfp;


@Repository("rfpDao")
public class RfpDaoImpl extends AbstractDao<Integer, Rfp> implements RfpDao{

	public Rfp findRfpById(int id) {		
		return getByKey(id);
	}

	@SuppressWarnings("unchecked")
	public List<Rfp> findAllRfp() {
		Criteria criteria = createEntityCriteria();
		return (List<Rfp>) criteria.list();
	}

}
