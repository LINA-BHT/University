package com.example.Universite.Entities;

import java.io.Serializable;
import java.util.List;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class departement implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long codeDEP;
	private String nomDEP;
	@JsonIgnore
	@ManyToOne 
	private universite univ;
	@JsonIgnore
	@OneToMany(mappedBy = "depar")
	private List<enseignants>enseig;
	public Long getCodeDEP() {
		return codeDEP;
	}
	public void setCodeDEP(Long codeDEP) {
		this.codeDEP = codeDEP;
	}
	public String getNomDEP() {
		return nomDEP;
	}
	public void setNomDEP(String nomDEP) {
		this.nomDEP = nomDEP;
	}
	public universite getUniv() {
		return univ;
	}
	public void setUniv(universite univ) {
		this.univ = univ;
	}
	public List<enseignants> getEnseig() {
		return enseig;
	}
	public void setEnseig(List<enseignants> enseig) {
		this.enseig = enseig;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public departement(Long codeDEP, String nomDEP, universite univ, List<enseignants> enseig) {
		super();
		this.codeDEP = codeDEP;
		this.nomDEP = nomDEP;
		this.univ = univ;
		this.enseig = enseig;
	}
	public departement() {
		super();
		// TODO Auto-generated constructor stub
	}
	
		
}
