package Pacote_Exercicios_Java_7_Cap1aoCap4;

import javax.swing.JOptionPane;
public class TransformacoesNaFraseComtoUpperCaseEtoLowerCase {

	public static void main(String[] args) {
		
		String frase = JOptionPane.showInputDialog("Forneça uma frase: ");
		
		JOptionPane.showMessageDialog(null, "Frase: " + frase + 
				"\nTodas em maiúsculas: " + frase.toUpperCase() + 
				"\nTodas em minúsculas: " + frase.toLowerCase());
		
		String x = frase.toUpperCase();
		System.out.println(x);
		x = frase.toLowerCase();
		System.out.println(x);
		
		System.exit(0);

	}

}
