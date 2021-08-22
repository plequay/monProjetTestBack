package model;

import javax.persistence.Entity;

@Entity
public class Sucres extends Ingredient {

	private EnumSucres sousCategorie;

	public Sucres() {
		super();
	}

	public Sucres(EnumSucres sousCategorie) {
		super();
		this.sousCategorie = sousCategorie;
	}

	public EnumSucres getSousCategorie() {
		return sousCategorie;
	}

	public void setSousCategorie(EnumSucres sousCategorie) {
		this.sousCategorie = sousCategorie;
	}

	@Override
	public String toString() {
		return "Sucres [sousCategorie=" + sousCategorie + ", id=" + id + ", nom=" + nom + ", quantite=" + quantite
				+ ", unite=" + unite + ", recettes=" + recettes + "]";
	}
}
