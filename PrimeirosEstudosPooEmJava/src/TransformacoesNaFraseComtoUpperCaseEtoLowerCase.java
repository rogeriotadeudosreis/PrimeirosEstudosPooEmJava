package Pacote_Exercicios_Java_7_Cap1aoCap4;

import javax.swing.JOptionPane;
public class TransformacoesNaFraseComtoUpperCaseEtoLowerCase {

	public static void main(String[] args) {
		
		String frase = JOptionPane.showInputDialog("Forne�a uma frase: ");
		
		JOptionPane.showMessageDialog(null, "Frase: " + frase + 
				"\nTodas em mai�sculas: " + frase.toUpperCase() + 
				"\nTodas em min�sculas: " + frase.toLowerCase());
		
		String x = frase.toUpperCase();
		System.out.println(x);
		x = frase.toLowerCase();
		System.out.println(x);
		
		System.exit(0);

	}

}
