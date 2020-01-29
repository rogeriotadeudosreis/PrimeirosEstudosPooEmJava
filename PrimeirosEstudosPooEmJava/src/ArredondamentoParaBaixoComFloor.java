package Pacote_Exercicios_Java_7_Cap1aoCap4;

import javax.swing.JOptionPane;
public class ArredondamentoParaBaixoComFloor {

	public static void main(String[] args) {

		double n1 = 5.2, n2 = 5.6, n3 = -5.8;
		
		JOptionPane.showMessageDialog(null, "Arredondamento com floor: " + 
		"\n" + n1 + " = " + Math.floor(n1) + 
		",   " + n2 + " = " + Math.floor(n2) + 
		",   " + n3 + " = " + Math.floor(n3));
		
		System.exit(0);
		
	}

}
