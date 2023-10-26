package Service;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BanqueService {
	public double conversion(double montant) {
		return montant*10.6;
	}
	public Compte getCompte( int code) {
		return new Compte(code, Math.random()*55555, new Date());
	}
	public List<Compte> listComptes(){
		List<Compte> l = new ArrayList<Compte>();
		l.add(new Compte(1, Math.random()*55555, new Date()));
		l.add(new Compte(2, Math.random()*55555, new Date()));
		l.add(new Compte(3, Math.random()*55555, new Date()));
		return l;
	}
	public static void main(String[]args) {
		BanqueService banqueService = new BanqueService();
        double montant = 100; // Replace this with any desired amount for testing
        double convertedAmount = banqueService.conversion(montant);
        System.out.println("Converted amount: " + convertedAmount);

        int code = 123; // Replace this with any desired code for testing
        Compte compte = banqueService.getCompte(code);
        System.out.println("Compte details: Code - " + compte.getCode() + ", Solde - " + compte.getSolde() + ", Date de création - " + compte.getDateCreation());

        List<Compte> comptes = banqueService.listComptes();
        System.out.println("Liste des comptes:");
        for (Compte c : comptes) {
            System.out.println("Code - " + c.getCode() + ", Solde - " + c.getSolde() + ", Date de création - " + c.getDateCreation());
        }
    }
	}