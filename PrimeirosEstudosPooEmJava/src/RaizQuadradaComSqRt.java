package Pacote_Exercicios_Java_7_Cap1aoCap4;

import javax.swing.JOptionPane;
public class RaizQuadradaComSqRt {

	public static void main(String[] args) {

		float num1 = Float.parseFloat(JOptionPane.showInputDialog("Forne�a o n�mero "));
		
		JOptionPane.showMessageDialog(null, "Raiz quadrada com sqrt: " + 
		"\n" + num1 + " = " + Math.sqrt(num1));
		
		System.exit(0);
		
	}

}
