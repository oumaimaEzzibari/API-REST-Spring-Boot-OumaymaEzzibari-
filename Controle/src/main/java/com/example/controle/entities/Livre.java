package com.example.controle.entities;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import org.springframework.data.annotation.Immutable;
import org.springframework.data.domain.Sort;

@Entity @Table(name="livre")

public class Livre {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer id;
	@Column(name="Title",length=50,nullable=false,updatable=true)
	private String titre;
	@Column(name="Maison_Edition",nullable=false,updatable=false)
	private String maisonEdition;
	@Column(name="Date_De_Sortie",updatable=true)
	private Date datedesortie;
	@Column(name="Auteur",nullable=false,updatable=true)
	private String auteur;
	@Column(name="Nombre_de_Page",updatable=true,nullable=false)
	private Integer Nbr_de_page;
	@Column(name="ISBN",nullable=false,unique=true,updatable=false)
	private Integer isbn;
	@Column(name="Date_de _Dernere_Consultation",updatable=true)
	private Date dateDerCon;
	@Column(name="Disponibility",updatable=true)
	private Boolean disponibility = false;
	
	

	@OrderBy(value = "id DESC")
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getMaisonEdition() {
		return maisonEdition;
	}
	
	public Date getDatedesortie() {
		return datedesortie;
	}
	public void setDatedesortie(Date datedesortie) {
		this.datedesortie = datedesortie;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public Integer getNbr_de_page() {
		return Nbr_de_page;
	}
	public void setNbr_de_page(Integer nbr_de_page) {
		Nbr_de_page = nbr_de_page;
	}
	public Integer getIsbn() {
		return isbn;
	}

	public Date getDateDerCon() {
		return dateDerCon;
	}
	public void setDateDerCon(Date dateDerCon) {
		this.dateDerCon = dateDerCon;
	}
	public Boolean getDisponibility() {
		return disponibility;
	}
	public void setDisponibility(Boolean disponibility) {
		this.disponibility = disponibility;
	}
	public Livre(Integer id, String Title, String  maisonEdition, Date datedesortie, String auteur, int Nbr_de_page, int isbn , Date dateDerCon,
			boolean disponibility) {
		// TODO Auto-generated constructor stub
		this.auteur=auteur;
		this.id=id;
		this.dateDerCon=dateDerCon;
		this.maisonEdition=maisonEdition;
		this.datedesortie=datedesortie;
		this.Nbr_de_page=Nbr_de_page;
		this.isbn=isbn;
		this.titre=Title;
		this.disponibility=disponibility;
		
	}
	public Livre() {
		super();
	}
}
