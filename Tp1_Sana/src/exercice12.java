import java.util.Scanner;

public class exercice12 {

	public static void main(String[] args) {
		
		//variables
		Double totalSecondes;
		int heures, minutes, secondes;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Donner le total des secondes: ");
		totalSecondes=sc.nextDouble();
		
		heures = (int) Math.floor(totalSecondes / 3600);
		minutes = (int) Math.floor((totalSecondes / 60) % 60);
		secondes = (int) (totalSecondes % 60);
		
		System.out.println("Heures: " + heures);
		System.out.println("Minutes: " + minutes);
		System.out.println("Secondes: " + secondes);

	}

}
