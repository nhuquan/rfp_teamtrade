package com.teamtrade.rfp_strategy.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
 
 

@Entity
@Table(name="ACTOR")
public class Actor  {	
	
	private int id;	
	private String name;
	private Set<Rfp> rfps = new HashSet<Rfp>(0);
	
	@Id	
	@Column(name = "ID", unique = true, nullable = false)
	public int getId() {
		return id;
	}	
	public void setId(int id) {
		this.id = id;
	}
	
	
	@Column(name = "NAME")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "actors")
	public Set<Rfp> getRfps() {
		return rfps;
	}
	public void setRfps(Set<Rfp> rfps) {
		this.rfps = rfps;
	}
	
	
}
