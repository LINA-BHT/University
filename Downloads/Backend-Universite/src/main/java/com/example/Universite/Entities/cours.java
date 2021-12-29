package com.example.Universite.Entities;

import java.io.Serializable;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
@Entity
public class cours implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long IdC;
	private String libelle;
	private String niveau;
	private String description;
	private String spécialité;
	private String diplome;
	public Long getIdC() {
		return IdC;
	}
	public void setIdC(Long idC) {
		IdC = idC;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getNiveau() {
		return niveau;
	}
	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSpécialité() {
		return spécialité;
	}
	public void setSpécialité(String spécialité) {
		this.spécialité = spécialité;
	}
	public String getDiplome() {
		return diplome;
	}
	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public cours() {
		super();
		// TODO Auto-generated constructor stub
	}
	public cours(Long idC, String libelle, String niveau, String description, String spécialité, String diplome) {
		super();
		IdC = idC;
		this.libelle = libelle;
		this.niveau = niveau;
		this.description = description;
		this.spécialité = spécialité;
		this.diplome = diplome;
	}
	
	
	





}

