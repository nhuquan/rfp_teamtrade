package com.teamtrade.rfp_strategy.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn; 

@Entity
@Table(name="RFP")
public class Rfp {

	private int id;
	private String name;
	private Set<Actor> actors = new HashSet<Actor>(0);
	private Set<Relation> relations = new HashSet<Relation> (0);
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	public int getId() {
		return id;
	}

	
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name = "NAME", length = 200)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "RFP_ACTOR", 
		joinColumns = {@JoinColumn(name = "RFP_ID", nullable = false, updatable = false) }, 
		inverseJoinColumns = { @JoinColumn(name = "ACTOR_ID", nullable = false, updatable = false) })
	public Set<Actor> getActors() {
		return actors;
	}

	public void setActors(Set<Actor> actors) {
		this.actors = actors;
	}
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "RFP_RELATION", 
		joinColumns = {@JoinColumn(name = "RFP_ID", nullable = false, updatable = false) }, 
		inverseJoinColumns = { @JoinColumn(name = "RELATIOn_ID", nullable = false, updatable = false) })
	public Set<Relation> getRelations() {
		return relations;
	}

	public void setRelations(Set<Relation> relations) {
		this.relations = relations;
	}
}
