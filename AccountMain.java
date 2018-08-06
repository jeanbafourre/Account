package Vanessa;

public class AccountMain extends Account {

    public void virement(int montantVirement, AccountMain debiteur) {
    	solde = solde + montantVirement;
    	debiteur.setSolde(debiteur.getSolde() - montantVirement);
    }

}