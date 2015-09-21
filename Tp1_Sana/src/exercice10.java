import java.util.Scanner;

public class exercice10 {

	public static void main(String[] args) {
		//constantes
		final float taux_TPS= (float) 0.05;
		final float taux_TVQ= (float) 0.09975;
		
		//variables
		int qte;
		float prix, montantTPS, montantTVQ;
		float montant_totale_avant_taxes;
		float montant_totale_apres_taxes;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Donner le prix unitaire d'un article acheté: ");
		prix=sc.nextFloat();
		System.out.println("Donner la quantité achetée: ");
		qte=sc.nextInt();
		
		System.out.print("Montant avant taxes: ");
		montant_totale_avant_taxes = prix * qte;
		System.out.println(montant_totale_avant_taxes);
		
		System.out.print("TPS (5%): ");
		montantTPS = montant_totale_avant_taxes * taux_TPS;
		System.out.println(montantTPS);
		
		System.out.print("TVQ (9.975%): ");
		montantTVQ = montant_totale_avant_taxes * taux_TVQ;
		System.out.println(montantTVQ);
		
		System.out.print("Montant après taxes: ");
		montant_totale_apres_taxes = montant_totale_avant_taxes +  montantTPS + montantTVQ;
		System.out.println(montant_totale_apres_taxes);
		
		

	}

}
