package com.example.Universite.Entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
public class spécialité  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long Id;
	private String nom;
	private String diplome;
	
	public spécialité(long id, String nom, String diplome, List<com.example.Universite.Entities.cours> cours) {
		super();
		Id = id;
		this.nom = nom;
		this.diplome = diplome;
		this.cours = cours;
	}

	public spécialité() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDiplome() {
		return diplome;
	}

	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}

	public List<cours> getCours() {
		return cours;
	}

	public void setCours(List<cours> cours) {
		this.cours = cours;
	}

	@ManyToMany
	@JoinTable(
	 name = "cours_spécialté",
	 joinColumns = @JoinColumn(name = "cours_id"),
	 inverseJoinColumns = @JoinColumn(name = "spécialité_id"))
	private List<cours> cours;

}
