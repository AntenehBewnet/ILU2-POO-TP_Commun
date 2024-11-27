package model;

public class Restaurant implements IEtablissement<FormulaireRestaurant> {

	private CentraleReservation<Table, FormulaireRestaurant> central = new CentraleReservation<>(new Table[100]);

	private static class Table extends EntiteReservable<FormulaireRestaurant> {
		private int nbChaises;
		private CalendrierAnnuel calendrierDeuxiemeService = new CalendrierAnnuel();

		public Table(int nbChaises) {
			this.nbChaises = nbChaises;
		}

		@Override
		public boolean compatible(FormulaireRestaurant formulaireRestaurant) {
			return false;
		}

		@Override
		Reservation reserver(FormulaireRestaurant entite) {
			// reservation = Reservation(10,2,1)
			return null;
		}

	}

	public void ajouterTable(int i) {
		// TODO Auto-generated method stub

	}

	public int[] donnerPossibilites(FormulaireRestaurant formulaire) {
		// TODO Auto-generated method stub
		return null;
	}

	public ReservationRestaurant reserver(int i, FormulaireRestaurant formulaire) {
		// TODO Auto-generated method stub
		return null;
	}
}
