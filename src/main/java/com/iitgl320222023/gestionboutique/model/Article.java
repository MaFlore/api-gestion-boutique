package com.iitgl320222023.gestionboutique.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "articles")
public class Article {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "code", nullable = false, unique = true)
	private String code;
	
	@Column(name = "designation", nullable = false, unique = true)
	private String designation;
	
	@Column(name = "prix_unitaire", nullable = false)
	private Integer prixUnitaire;
	
	@Column(name = "quantite", nullable = false)
	private Integer quantite;
	
	@Column(name = "description")
	private String description;
	
	public Article() {
		
	}
	
	public Article(String designation, Integer prixUnitaire, Integer quantite, String description) {
		super();
		this.designation = designation;
		this.prixUnitaire = prixUnitaire;
		this.quantite = quantite;
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Integer getPrixUnitaire() {
		return prixUnitaire;
	}

	public void setPrixUnitaire(Integer prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

	public Integer getQuantite() {
		return quantite;
	}

	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Article [code=" + code + ", designation=" + designation + ", prixUnitaire=" + prixUnitaire
				+ ", quantite=" + quantite + ", description=" + description + "]";
	}

}

