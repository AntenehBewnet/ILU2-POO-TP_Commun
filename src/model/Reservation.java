package model;

public abstract class Reservation {

	private int jour;
	private int mois;

	public Reservation(int jour, int mois) {
		this.jour = jour;
		this.mois = mois;
	}

	@Override
	public String toString() {
		return String.valueOf(jour) + "/" + String.valueOf(mois);
	}

}
