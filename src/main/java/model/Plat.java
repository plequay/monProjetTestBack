package model;

import java.util.ArrayList;
import java.util.List;

public class Plat {
	
	private int id;
	private String nom;
	private List<Recette> recettes = new ArrayList();
	private Categorie categorie;
	
	public Plat() {
		super();
	}

	public Plat(String nom, List<Recette> recettes, Categorie categorie) {
		super();
		this.nom = nom;
		this.recettes = recettes;
		this.categorie = categorie;
	}

	public Plat(int id, String nom, List<Recette> recettes, Categorie categorie) {
		super();
		this.id = id;
		this.nom = nom;
		this.recettes = recettes;
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

	public List<Recette> getRecettes() {
		return recettes;
	}

	public void setRecettes(List<Recette> recettes) {
		this.recettes = recettes;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	@Override
	public String toString() {
		return "Plat [id=" + id + ", nom=" + nom + ", recettes=" + recettes + ", categorie=" + categorie + "]";
	}
	
}
