
import javax.swing.JOptionPane;

public class exercice11 {

	public static void main(String[] args) {
		//constantes
		final float taux_TPS= (float) 0.05;
		final float taux_TVQ= (float) 0.095;
		
		//variables
		int qte;
		float prix, montantTPS, montantTVQ;
		float montant_totale_avant_taxes;
		float montant_totale_apres_taxes;
		String saisie;
		saisie= JOptionPane.showInputDialog("Donner le prix unitaire d'un article acheté: ");
		prix=Float.parseFloat(saisie);
		saisie= JOptionPane.showInputDialog("Donner la quantité achetée: ");
		qte=Integer.parseInt(saisie);
		
		montant_totale_avant_taxes = prix * qte;
		montantTPS = montant_totale_avant_taxes * taux_TPS;
		montantTVQ = (montant_totale_avant_taxes + montantTPS) * taux_TVQ;
		montant_totale_apres_taxes = montant_totale_avant_taxes +  montantTPS + montantTVQ;
		
		JOptionPane.showMessageDialog(null,"Montant avant taxes: " + montant_totale_avant_taxes + 
				"\nTPS (5%): " + montantTPS +
				"\nTVQ (9.5%): " + montantTVQ +
				"\nMontant après taxes: " + montant_totale_apres_taxes);

	}

}
