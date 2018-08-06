package Vanessa;

public class Account implements CountInterface {
    public double solde;

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	@Override
	public void virement() {
		// TODO Auto-generated method stub
		
	}
}