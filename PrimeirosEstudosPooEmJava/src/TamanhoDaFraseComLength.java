package Pacote_Exercicios_Java_7_Cap1aoCap4;

import javax.swing.JOptionPane;

public class TamanhoDaFraseComLength {

	public static void main(String[] args) {

		String frase = JOptionPane.showInputDialog("Forneça uma frase ");
		int tamanho = frase.length();
		JOptionPane.showMessageDialog(null, "Frase: " + frase + "\nQuantidade de caracteres: " + tamanho);

		System.exit(0);

	}

}
