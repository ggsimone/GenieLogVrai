package myPackage;

public class CompteCourant {
	
	private double _solde;
	
	public CompteCourant(double solde) {
		_solde = solde;
	}
	
	public void depotCompte(double qteC) {
		_solde += qteC;
	}
	
	public double getSolde() {	//amogus
		return _solde;
	}
	

}
