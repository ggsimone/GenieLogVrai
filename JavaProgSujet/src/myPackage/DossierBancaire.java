package myPackage;

public class DossierBancaire {
	
	private CompteCourant CC;
	private CompteEpargne CE;
	private  double vent_epargne;	//Ventilation epargne, proportion deposee sur le compte epargne par depot
	private double m_solde;
	private double _taux;
	
	//Constructeur
    public DossierBancaire()
    {
    	vent_epargne = 0.6;
    	CC = new CompteCourant(0);
    	CE = new CompteEpargne(0);
    	m_solde = CC.getSolde() + CE.getSolde();
    	_taux = 1.0032;
    	
    	// je trouve que ce constructeur est un peu lourd mais il est bien
    }

    
    public void deposer(double value) {
    	CC.depotCompte(value*(1-vent_epargne));
    	CE.depotCompte(value*vent_epargne);
    	m_solde=CC.getSolde() + CE.getSolde();		//ca au lieu de +=value pour si jamais y a un soucis pendant les depots
    }
    
    
    public double get_solde() {return m_solde;}
    
    
    public void remunerer() {						//cette fonction destinée au banquier permet de rémunérer le dossier du client.
    	CE.setSolde(CE.getSolde()*_taux);
    	m_solde=CC.getSolde() + CE.getSolde();
    }
	
    
    //Ajout commentaire partie 4
    
    
    
    public void retirer(double value) {
    		if(value > CC.getSolde()) {
    			throw new ArithmeticException("Solde insuffisant");
    		}
    		else {
    			CC.setSolde(CC.getSolde()-value);
    			m_solde=CC.getSolde() + CE.getSolde();
    		}  		

    }
}
