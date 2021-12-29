package com.example.Universite.Entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class lieu implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long codel;
    private String noml;
    private int capacite;
	
    @JsonIgnore
	@OneToMany(mappedBy ="lieu", cascade = CascadeType.ALL)
	private List<seance>seances;


	public lieu() {
		super();
		// TODO Auto-generated constructor stub
	}


	public lieu(long codel, String noml, int capacite, List<seance> seances) {
		super();
		this.codel = codel;
		this.noml = noml;
		this.capacite = capacite;
		this.seances = seances;
	}


	public lieu(long codel, String noml, int capacite) {
		super();
		this.codel = codel;
		this.noml = noml;
		this.capacite = capacite;
	}


	public long getCodel() {
		return codel;
	}


	public void setCodel(long codel) {
		this.codel = codel;
	}


	public String getNoml() {
		return noml;
	}


	public void setNoml(String noml) {
		this.noml = noml;
	}


	



	public int getCapacite() {
		return capacite;
	}


	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}


	public List<seance> getSeances() {
		return seances;
	}


	public void setSeances(List<seance> seances) {
		this.seances = seances;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

	

	

}
