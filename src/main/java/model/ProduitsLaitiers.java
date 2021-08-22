package model;

import javax.persistence.Entity;

@Entity
public class ProduitsLaitiers  extends Ingredient{

	private EnumProduitsLaitiers sousCategorie;

	public ProduitsLaitiers() {
		super();
	}

	public ProduitsLaitiers(EnumProduitsLaitiers sousCategorie) {
		super();
		this.sousCategorie = sousCategorie;
	}

	public EnumProduitsLaitiers getSousCategorie() {
		return sousCategorie;
	}

	public void setSousCategorie(EnumProduitsLaitiers sousCategorie) {
		this.sousCategorie = sousCategorie;
	}

	@Override
	public String toString() {
		return "ProduitsLaitiers [sousCategorie=" + sousCategorie + ", id=" + id + ", nom=" + nom + ", quantite="
				+ quantite + ", unite=" + unite + ", recettes=" + recettes + "]";
	}
}
