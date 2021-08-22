package model;

import javax.persistence.Entity;

@Entity
public class CerealesLegumineuses extends Ingredient {

		private EnumCerealesLegumineuses sousCategorie;

		public CerealesLegumineuses() {
			super();
		}

		public CerealesLegumineuses(EnumCerealesLegumineuses sousCategorie) {
			super();
			this.sousCategorie = sousCategorie;
		}

		public EnumCerealesLegumineuses getSousCategorie() {
			return sousCategorie;
		}

		public void setSousCategorie(EnumCerealesLegumineuses sousCategorie) {
			this.sousCategorie = sousCategorie;
		}

		@Override
		public String toString() {
			return "CerealesLegumineuses [sousCategorie=" + sousCategorie + ", id=" + id + ", nom=" + nom
					+ ", quantite=" + quantite + ", unite=" + unite + ", recettes=" + recettes + "]";
		}	
}
