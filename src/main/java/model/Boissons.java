package model;

import javax.persistence.Entity;

@Entity
public class Boissons extends Ingredient{

	private EnumBoissons sousCategorie;

	public Boissons() {
		super();
	}

	public Boissons(EnumBoissons sousCategorie) {
		super();
		this.sousCategorie = sousCategorie;
	}

	public EnumBoissons getSousCategorie() {
		return sousCategorie;
	}

	public void setSousCategorie(EnumBoissons sousCategorie) {
		this.sousCategorie = sousCategorie;
	}

	@Override
	public String toString() {
		return "Boissons [sousCategorie=" + sousCategorie + ", id=" + id + ", nom=" + nom + ", quantite=" + quantite
				+ ", unite=" + unite + ", recettes=" + recettes + "]";
	}
	
}
