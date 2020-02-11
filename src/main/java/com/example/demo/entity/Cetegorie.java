package com.example.demo.entity;

import java.io.Serializable;
import java.util.Collection;

public class Cetegorie  implements Serializable{
	private Long id ; 
	private String nameCategory; 
	private Collection<Produit> produits; 

	public Cetegorie() {
	// TODO Auto-generated constructor stub
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameCategory() {
		return nameCategory;
	}

	public void setNameCategory(String nameCategory) {
		this.nameCategory = nameCategory;
	}

	public Collection<Produit> getProduits() {
		return produits;
	}

	public void setProduits(Collection<Produit> produits) {
		this.produits = produits;
	}
	
}
