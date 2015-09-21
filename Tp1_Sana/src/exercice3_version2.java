import javax.swing.JOptionPane;

public class exercice3_version2 {
	public static void main(String[] args) {
		int A,B,C,Max;
		String saisie;
		saisie= JOptionPane.showInputDialog("entrer un nombre A:");
		A=Integer.parseInt(saisie);
		saisie= JOptionPane.showInputDialog("entrer un nombre B:");
		B=Integer.parseInt(saisie);
		saisie= JOptionPane.showInputDialog("entrer un nombre C:");
		C=Integer.parseInt(saisie);
		//*********1 ERE VERSION**********//
		if(   A> B && A>C  )
		{ Max=A;
			JOptionPane.showMessageDialog(null, "le Max des nombres est:"+ Max);}
		else if(   B> A && B>C  ){
			Max=B;
			JOptionPane.showMessageDialog(null, "le Max des nombres est:"+ Max);}
		else{ Max=C;
			JOptionPane.showMessageDialog(null, "le Max des nombres est:"+ Max);}
			
		}}
		
		
		

