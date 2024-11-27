package model;

public class CentraleReservation<E extends EntiteReservable<F>, F extends Formulaire> {

	private E[] tabEntite;
	private int nbEntite = 0;

	public CentraleReservation(E[] tabEntite) {

		this.tabEntite = tabEntite;
	}

	public int ajouterEntite(E entite) {
		tabEntite[nbEntite++] = entite;
		return nbEntite;
	}

	public int[] donnerPossibilitees(F formulaire) {
		int[] possibilites = new int[nbEntite];
		for (int i = 0, j = 0; i < nbEntite; i++) {
			if (tabEntite[i].compatible(formulaire) && tabEntite[i].estLibre(formulaire)) {
				possibilites[j] = (i + 1);
			}

		}
		return possibilites;
	}

	public Reservation reserver(int numEntite, F formulaire) {
		EntiteReservable<F> entite = tabEntite[numEntite - 1];
		formulaire.setIdentificationEntite(entite.getNumero());
		return entite.reserver(formulaire);
	}

}
