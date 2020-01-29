package Pacote_Exercicios_Java_7_Cap1aoCap4;

import javax.swing.JOptionPane;
public class ArredondamentoParaCima {

	public static void main(String[] args) {

		double n1 = 5.2, n2 = 5.6, n3 = -5.8;
		
		JOptionPane.showMessageDialog(null, "Arredondamento com ceil: " + 
		"\n" + n1 + " = " + Math.ceil(n1) + 
		",   " + n2 + " = "  + Math.ceil(n2) + 
		",   " + n3 + " = " + Math.ceil(n3));
		
		double an1 = Math.ceil(n1);
		double an2 = Math.ceil(n2);
		double an3 = Math.ceil(n3);
		
		System.out.printf("Arredondamento com ceil: \n%.1f = %.1f  %.1f = %.1f  %.1f = %.1f"
				, n1, an1,  n2, an2,  n3, an3);
		
		System.exit(0);
		
	}

}
