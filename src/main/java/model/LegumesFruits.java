package model;

import javax.persistence.Entity;

@Entity
public class LegumesFruits extends Ingredient {

	private EnumLegumesFruits sousCategorie;

	public LegumesFruits() {
		super();
	}

	public LegumesFruits(EnumLegumesFruits sousCategorie) {
		super();
		this.sousCategorie = sousCategorie;
	}

	public EnumLegumesFruits getSousCategorie() {
		return sousCategorie;
	}

	public void setSousCategorie(EnumLegumesFruits sousCategorie) {
		this.sousCategorie = sousCategorie;
	}

	@Override
	public String toString() {
		return "LegumesFruits [sousCategorie=" + sousCategorie + ", id=" + id + ", nom=" + nom + ", quantite="
				+ quantite + ", unite=" + unite + ", recettes=" + recettes + "]";
	}
}
