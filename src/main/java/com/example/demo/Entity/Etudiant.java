package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="etudiant")
public class Etudiant {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String prenom;
	private String nom;
	private String niveau;
	private String filiaire;
	public Etudiant(long id, String prenom, String nom, String niveau, String filiaire) {
		super();
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.niveau = niveau;
		this.filiaire = filiaire;
	}
	public Etudiant(String prenom, String nom, String niveau, String filiaire) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.niveau = niveau;
		this.filiaire = filiaire;
	}
	public Etudiant() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public String getNiveau() {
		return niveau;
	}
	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	public String getFiliaire() {
		return filiaire;
	}
	public void setFiliaire(String filiaire) {
		this.filiaire = filiaire;
	}
	
	

}
