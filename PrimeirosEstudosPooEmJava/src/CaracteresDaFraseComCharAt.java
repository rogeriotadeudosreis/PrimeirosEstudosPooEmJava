package Pacote_Exercicios_Java_7_Cap1aoCap4;

import javax.swing.JOptionPane;
public class CaracteresDaFraseComCharAt {

	public static void main(String[] args) {

		String frase = JOptionPane.showInputDialog("Aprendendo Java");
		String trecho = "";
		
		for (int i = 11; i <= 14; i++) {
			trecho = trecho + frase.charAt(i);
			
		}
		JOptionPane.showMessageDialog(null, "Frase: " + frase + 
				"\nCaractere 2: " + frase.charAt(1) + 
				"\nTrecho: " + trecho);
	}

}
