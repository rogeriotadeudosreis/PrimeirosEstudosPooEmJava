package Pacote_Exercicios_Java_7_Cap1aoCap4;

import javax.swing.JOptionPane;
public class PotenciaComPow {

	public static void main(String[] args) {

		float base = Float.parseFloat(JOptionPane.showInputDialog("Forne�a o valor da base "));
		float potencia = Float.parseFloat(JOptionPane.showInputDialog("Forne�a o valor da pot�ncia"));
		
		JOptionPane.showMessageDialog(null, "Pot�ncia com pow: " + 
		"\nValor da base: " + base + 
		"\nValor da pot�ncia: " + potencia + 
		"\nResultado: " + Math.pow(base, potencia));
		
		System.exit(0);
		
	}

}
