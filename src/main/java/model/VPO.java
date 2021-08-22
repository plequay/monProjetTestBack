package model;

import javax.persistence.Entity;

@Entity
public class VPO extends Ingredient {
	
	private EnumVPO sousCategorie;

	public VPO() {
		super();
	}
	
	public VPO(EnumVPO sousCategorie) {
		super();
		this.sousCategorie = sousCategorie;
	}

	public EnumVPO getSousCategorie() {
		return sousCategorie;
	}

	public void setSousCategorie(EnumVPO sousCategorie) {
		this.sousCategorie = sousCategorie;
	}

	@Override
	public String toString() {
		return "VPO [sousCategorie=" + sousCategorie + ", id=" + id + ", nom=" + nom + ", quantite=" + quantite
				+ ", unite=" + unite + ", recettes=" + recettes + "]";
	}
}
