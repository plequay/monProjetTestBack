package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Plat {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	private String nom;
	@Enumerated(EnumType.STRING)
	private Categorie categorie;
	
	public Plat() {
		super();
	}

	public Plat(String nom, Categorie categorie) {
		super();
		this.nom = nom;
		this.categorie = categorie;
	}

	public Plat(int id, String nom, Categorie categorie) {
		super();
		this.id = id;
		this.nom = nom;
		this.categorie = categorie;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}


	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	@Override
	public String toString() {
		return "Plat [id=" + id + ", nom=" + nom + ", categorie=" + categorie + "]";
	}

}
