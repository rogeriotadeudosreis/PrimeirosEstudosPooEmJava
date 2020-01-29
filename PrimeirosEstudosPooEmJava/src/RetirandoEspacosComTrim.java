package Pacote_Exercicios_Java_7_Cap1aoCap4;

import javax.swing.JOptionPane;

public class RetirandoEspacosComTrim {

	public static void main(String[] args) {

		String frase = JOptionPane.showInputDialog("Forneça uma frase");

		frase = "   " + frase + "   ";
		JOptionPane.showMessageDialog(null,
				"\nCom espaços: " + "-" + frase + "-" + 
				"\nSem espaços: " + "-" + frase.trim() + "-");
		
		System.out.println("-" + frase + "-");
		System.out.println("-" + frase.trim() + "-");

		System.exit(0);
	}

}
