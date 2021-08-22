package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


@Entity
public class Recette {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	private String nom;
	@ManyToOne
	private Plat plat;
	@ManyToMany(cascade =  {CascadeType.PERSIST,CascadeType.MERGE})
	@JoinTable
	(
			name="composition",
			joinColumns = @JoinColumn(name="recette"),
			inverseJoinColumns =  @JoinColumn(name="ingredient")
	)
	private List<Ingredient> ingredients = new ArrayList();
	
	public Recette() {
		super();
	}

	public Recette(String nom, Plat plat, List<Ingredient> ingredients) {
		super();
		this.nom = nom;
		this.plat = plat;
		this.ingredients = ingredients;
	}

	public Recette(int id, String nom, Plat plat, List<Ingredient> ingredients) {
		super();
		this.id = id;
		this.nom = nom;
		this.plat = plat;
		this.ingredients = ingredients;
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

	public Plat getPlat() {
		return plat;
	}

	public void setPlat(Plat plat) {
		this.plat = plat;
	}

	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	@Override
	public String toString() {
		return "Recette [id=" + id + ", nom=" + nom + ", plat=" + plat + ", ingredients=" + ingredients + "]";
	}
}
