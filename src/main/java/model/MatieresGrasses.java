package model;

import javax.persistence.Entity;

@Entity
public class MatieresGrasses extends Ingredient {
	
	private EnumMatieresGrasses sousCategorie;

	public MatieresGrasses() {
		super();
	}

	public MatieresGrasses(EnumMatieresGrasses sousCategorie) {
		super();
		this.sousCategorie = sousCategorie;
	}


	public EnumMatieresGrasses getSousCategorie() {
		return sousCategorie;
	}

	public void setSousCategorie(EnumMatieresGrasses sousCategorie) {
		this.sousCategorie = sousCategorie;
	}

	@Override
	public String toString() {
		return "MatieresGrasses [sousCategorie=" + sousCategorie + ", id=" + id + ", nom=" + nom + ", quantite="
				+ quantite + ", unite=" + unite + ", recettes=" + recettes + "]";
	}
}
