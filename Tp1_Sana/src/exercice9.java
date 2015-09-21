import java.util.Scanner;

public class exercice9 {

	public static void main(String[] args) {
		Double R1,R2,R3,Req;
		Scanner sc=new Scanner(System.in);
		System.out.println("donner R1: ");
		R1=sc.nextDouble();
		System.out.println("donner R2: ");
		R2=sc.nextDouble();
		System.out.println("donner R3: ");
		R3=sc.nextDouble();
		Req=R1*R2*R3/(R1*R2+R1*R3+R2*R3);
		System.out.println("Req="+Req);
	}

}
