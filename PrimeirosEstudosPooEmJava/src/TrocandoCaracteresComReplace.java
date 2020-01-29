package Pacote_Exercicios_Java_7_Cap1aoCap4;

import javax.swing.JOptionPane;
public class TrocandoCaracteresComReplace {

	public static void main(String[] args) {
		
		String frase = JOptionPane.showInputDialog("Forneça uma frase ");
		
		JOptionPane.showMessageDialog(null, "Frase: " + frase + 
				"\nRetirando os espaços: " + frase.replace(" ", "") + 
				"\nSubstituindo a por u: " + frase.replace("a", "u"));
		System.exit(0);

	}

}
