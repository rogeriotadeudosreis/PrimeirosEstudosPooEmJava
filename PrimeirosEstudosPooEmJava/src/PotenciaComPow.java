package Pacote_Exercicios_Java_7_Cap1aoCap4;

import javax.swing.JOptionPane;
public class PotenciaComPow {

	public static void main(String[] args) {

		float base = Float.parseFloat(JOptionPane.showInputDialog("Forneça o valor da base "));
		float potencia = Float.parseFloat(JOptionPane.showInputDialog("Forneça o valor da potência"));
		
		JOptionPane.showMessageDialog(null, "Potência com pow: " + 
		"\nValor da base: " + base + 
		"\nValor da potência: " + potencia + 
		"\nResultado: " + Math.pow(base, potencia));
		
		System.exit(0);
		
	}

}
