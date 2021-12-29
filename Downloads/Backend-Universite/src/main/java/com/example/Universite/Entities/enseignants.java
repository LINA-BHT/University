package com.example.Universite.Entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class enseignants implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long matricule;
	private String nomENS;
	private String prenomENS;
	private String adresseENS;
	private String diplome;
	private String email;
	private String password;
	@Column(name="prof_pic")
    private byte[] profPic;
	@JsonIgnore
	@ManyToOne
	private departement depar;
	@JsonIgnore
	@OneToMany(mappedBy = "enseig")
	private List<seance>seances;

	public Long getMatricule() {
		return matricule;
	}

	public void setMatricule(Long matricule) {
		this.matricule = matricule;
	}

	public String getNomENS() {
		return nomENS;
	}

	public void setNomENS(String nomENS) {
		this.nomENS = nomENS;
	}

	public String getPrenomENS() {
		return prenomENS;
	}

	public void setPrenomENS(String prenomENS) {
		this.prenomENS = prenomENS;
	}

	public String getAdresseENS() {
		return adresseENS;
	}

	public void setAdresseENS(String adresseENS) {
		this.adresseENS = adresseENS;
	}

	public String getDiplome() {
		return diplome;
	}

	public void setDiplome(String diplome) {
		this.diplome = diplome;
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

	public byte[] getProfPic() {
		return profPic;
	}

	public void setProfPic(byte[] profPic) {
		this.profPic = profPic;
	}

	public departement getDepar() {
		return depar;
	}

	public void setDepar(departement depar) {
		this.depar = depar;
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

	public enseignants(Long matricule, String nomENS, String prenomENS, String adresseENS, String diplome, String email,
			String password, byte[] profPic, departement depar, List<seance> seances) {
		super();
		this.matricule = matricule;
		this.nomENS = nomENS;
		this.prenomENS = prenomENS;
		this.adresseENS = adresseENS;
		this.diplome = diplome;
		this.email = email;
		this.password = password;
		this.profPic = profPic;
		this.depar = depar;
		this.seances = seances;
	}

	public enseignants() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
