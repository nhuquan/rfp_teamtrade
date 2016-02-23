package com.teamtrade.rfp_strategy.model;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name="RELATION")
public class Relation {

	private int id;
	private int actor_from_id;
	private int actor_to_id;
	private String name;
	private Set<Rfp> rfps =  new HashSet<Rfp> (0);
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name = "ACTOR_FROM")
	public int getActor_from_id() {
		return actor_from_id;
	}
	public void setActor_from_id(int actor_from_id) {
		this.actor_from_id = actor_from_id;
	}
	
	@Column(name = "ACTOR_TO")
	public int getActor_to_id() {
		return actor_to_id;
	}
	public void setActor_to_id(int actor_to_id) {
		this.actor_to_id = actor_to_id;
	}
	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "relations")
	public Set<Rfp> getRfps() {
		return rfps;
	}
	public void setRfps(Set<Rfp> rfps) {
		this.rfps = rfps;
	}
	
	@Column(name = "NAME")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
