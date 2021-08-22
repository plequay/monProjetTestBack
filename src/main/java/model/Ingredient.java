package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Ingredient {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	protected int id;
	protected String nom;
	protected double quantite;
	@Enumerated(EnumType.STRING)
	protected Unite unite;
	@ManyToMany
	protected List<Recette> recettes= new ArrayList();
	
	public Ingredient() {
		super();
	}

	public Ingredient(String nom, double quantite, Unite unite, List<Recette> recettes) {
		super();
		this.nom = nom;
		this.quantite = quantite;
		this.unite = unite;
		this.recettes = recettes;
	}

	public Ingredient(int id, String nom, double quantite, Unite unite, List<Recette> recettes) {
		super();
		this.id = id;
		this.nom = nom;
		this.quantite = quantite;
		this.unite = unite;
		this.recettes = recettes;
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

	public double getQuantite() {
		return quantite;
	}

	public void setQuantite(double quantite) {
		this.quantite = quantite;
	}

	public Unite getUnite() {
		return unite;
	}

	public void setUnite(Unite unite) {
		this.unite = unite;
	}

	public List<Recette> getRecettes() {
		return recettes;
	}

	public void setRecettes(List<Recette> recettes) {
		this.recettes = recettes;
	}

	@Override
	public String toString() {
		return "Ingredient [id=" + id + ", nom=" + nom + ", quantite=" + quantite + ", unite=" + unite + ", recettes="
				+ recettes + "]";
	}
}
