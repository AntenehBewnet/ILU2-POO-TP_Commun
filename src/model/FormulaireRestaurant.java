package model;

public class FormulaireRestaurant extends Formulaire {

	private int nbPersonne;
	private int numService;

	public FormulaireRestaurant(int jour, int mois, int nbPersonnes, int numService) {
		super(jour, mois);
		this.nbPersonne = nbPersonnes;
		this.numService = numService;

	}

	public int getNombrePersonnes() {
		return nbPersonne;
	}

	public int getNumService() {
		return numService;
	}

}
