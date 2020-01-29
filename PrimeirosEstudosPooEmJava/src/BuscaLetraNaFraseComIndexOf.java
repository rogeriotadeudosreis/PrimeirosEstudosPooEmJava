package Pacote_Exercicios_Java_7_Cap1aoCap4;

import javax.swing.JOptionPane;

public class BuscaLetraNaFraseComIndexOf {

	public static void main(String[] args) {
		
		String frase = "Livro Java 7 - Ensino Didatico";
		
		char caractere = 'a';
		
		JOptionPane.showMessageDialog(null, "Frase: " + frase + 
				"\nIndices: " + frase.indexOf(caractere) + 
				", " + frase.indexOf(caractere, 10) + 
				", " + frase.indexOf("Ensino") + 
				", " + frase.indexOf("Java", 15));
		System.exit(0);

	}

}
