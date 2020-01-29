package Pacote_Exercicios_Java_7_Cap1aoCap4;

import javax.swing.JOptionPane;

public class MaiorMenorComMax {

	public static void main(String[] args) {

		float num1 = Float.parseFloat(JOptionPane.showInputDialog("Forneça o primeiro número "));
		float num2 = Float.parseFloat(JOptionPane.showInputDialog("Forneça o segundo número "));
		
		JOptionPane.showMessageDialog(null, "Números fornecidos: " + num1 + " , " + num2 + 
				"\nO maior número é " + Math.max(num1, num2) + 
				"\nO menor número é " + Math.min(num1, num2));
		
		System.exit(0);
				
	}

}
