package com.example.Universite.Entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class universite implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long cadeUNV;
	private String nomUNV;
	private String adresseSite;
	private String adresse;
	private String description;
	private String directeur;
	
	@OneToMany(mappedBy = "univ")
	private List<departement>departements;

	public Long getCadeUNV() {
		return cadeUNV;
	}

	public void setCadeUNV(Long cadeUNV) {
		this.cadeUNV = cadeUNV;
	}

	public String getNomUNV() {
		return nomUNV;
	}

	public void setNomUNV(String nomUNV) {
		this.nomUNV = nomUNV;
	}

	public String getAdresseSite() {
		return adresseSite;
	}

	public void setAdresseSite(String adresseSite) {
		this.adresseSite = adresseSite;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDirecteur() {
		return directeur;
	}

	public void setDirecteur(String directeur) {
		this.directeur = directeur;
	}

	public List<departement> getDepartements() {
		return departements;
	}

	public void setDepartements(List<departement> departements) {
		this.departements = departements;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public universite() {
		super();
		// TODO Auto-generated constructor stub
	}

	public universite(Long cadeUNV, String nomUNV, String adresseSite, String adresse, String description,
			String directeur, List<departement> departements) {
		super();
		this.cadeUNV = cadeUNV;
		this.nomUNV = nomUNV;
		this.adresseSite = adresseSite;
		this.adresse = adresse;
		this.description = description;
		this.directeur = directeur;
		this.departements = departements;
	}

	 
}
