package model;

public abstract class EntiteReservable<T extends Formulaire> {

	CalendrierAnnuel calendrier = new CalendrierAnnuel();
	private int numero;

	boolean estLibre(T entite) {
		return calendrier.estLibre(entite.getJour(), entite.getMois());
	}

	public int getNumero() {
		return numero;
	}

	abstract boolean compatible(T entite);

	abstract Reservation reserver(T entite);

}
