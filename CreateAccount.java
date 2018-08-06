package Vanessa;

public class CreateAccount {
	
	public static void main(String[] args) {
	
	// On créé les instances
    AccountMain pierreAccountMain = new AccountMain();
    AccountPEL pierreAccountPEL = new AccountPEL();
    AccountMain aureliaAccountMain = new AccountMain();
    AccountPEL aureliaAccountPEL = new AccountPEL();
    
    // On affecte les valeurs aux variables des instances (toujours avec les "set")
    aureliaAccountMain.setSolde(100);
    pierreAccountMain.setSolde(200);
    
    // 1 - On affiche les soldes avant la méthode
    // 2 - On appelle la méthode (toujours avec les "get")
    // 3 - On affiche les nouveaux soldes après la méthode
    System.out.println("Le solde du compte de Pierre avant le virement est de " + pierreAccountMain.getSolde() + " Euros.");
    System.out.println("Le solde du compte d'Aurélia avant le virement est de " + aureliaAccountMain.getSolde() + " Euros.");
    pierreAccountMain.virement(25,aureliaAccountMain);
    System.out.println("Le solde du compte de Pierre après le virement est de " + pierreAccountMain.getSolde() + " Euros.");
    System.out.println("Le solde du compte d'Aurélia après le virement est de " + aureliaAccountMain.getSolde() + " Euros.");
}
}