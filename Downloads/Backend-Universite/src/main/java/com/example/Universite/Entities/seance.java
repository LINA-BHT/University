package com.example.Universite.Entities;


import java.io.Serializable;

import java.sql.Date;
import java.util.List;

import javax.persistence.*;




@Entity
public class seance implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long IdSC;
	private Date date;
	
	@ManyToOne
	private enseignants enseig;
	
	@ManyToOne
	private cours cr;
	@ManyToOne
	private lieu lieu;
	@ManyToMany
	@JoinTable(
	 name = "etudiant_seance",
	 joinColumns = @JoinColumn(name = "etudiant_id"),
	 inverseJoinColumns = @JoinColumn(name = "seance_id"))
	private List<etudiant> etudiants;
	public long getIdSC() {
		return IdSC;
	}
	public void setIdSC(long idSC) {
		IdSC = idSC;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public enseignants getEnseig() {
		return enseig;
	}
	public void setEnseig(enseignants enseig) {
		this.enseig = enseig;
	}
	public cours getCr() {
		return cr;
	}
	public void setCr(cours cr) {
		this.cr = cr;
	}
	public lieu getLieu() {
		return lieu;
	}
	public void setLieu(lieu lieu) {
		this.lieu = lieu;
	}
	public List<etudiant> getEtudiants() {
		return etudiants;
	}
	public void setEtudiants(List<etudiant> etudiants) {
		this.etudiants = etudiants;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public seance(long idSC, Date date, enseignants enseig, cours cr, com.example.Universite.Entities.lieu lieu,
			List<etudiant> etudiants) {
		super();
		IdSC = idSC;
		this.date = date;
		this.enseig = enseig;
		this.cr = cr;
		this.lieu = lieu;
		this.etudiants = etudiants;
	}
	public seance() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}