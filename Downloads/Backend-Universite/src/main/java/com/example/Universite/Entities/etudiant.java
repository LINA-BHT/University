package com.example.Universite.Entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class etudiant implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="prenom")
	private String prenom;
	
	@Column(name="nom")
	private String nom;
	
	@Column(name="adresse")
	private String adresse;
	
	@Column(name="dateEntrée")
	private Date dateEntrée;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	
	 @ManyToMany(mappedBy ="etudiants")
	  private List<seance> seances;


	public etudiant(Long id, String prenom, String nom, String adresse, Date dateEntrée, String email, String password,
			List<seance> seances) {
		super();
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.adresse = adresse;
		this.dateEntrée = dateEntrée;
		this.email = email;
		this.password = password;
		this.seances = seances;
	}


	public etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public Date getDateEntrée() {
		return dateEntrée;
	}


	public void setDateEntrée(Date dateEntrée) {
		this.dateEntrée = dateEntrée;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public List<seance> getSeances() {
		return seances;
	}


	public void setSeances(List<seance> seances) {
		this.seances = seances;
	}
	  



	
	  
	
	
}