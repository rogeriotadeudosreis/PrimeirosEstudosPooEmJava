package Pacote_Exercicios_Java_7_Cap1aoCap4;

import javax.swing.JOptionPane;

public class Calculando_IMC_comJOptionPane {

	public static void main(String[] args) {

		// Calculando o IMC, dando entradas pelo JOptionPane
		String aux = "";
		float peso = 0, altura = 0, imc = 0;

		try {
			aux = JOptionPane.showInputDialog("Informe seu peso");
			peso = Float.parseFloat(aux);

			aux = JOptionPane.showInputDialog("Informe sua altura");
			altura = Float.parseFloat(aux);

			imc = (peso / (altura * altura));

			if (imc <= 18.5) {
				JOptionPane.showMessageDialog(null,
						"Seu índice de massa corporal (IMC) é: " + imc + "\nPeso abaixo do normal!");

			} else if (imc > 18.5 && imc < 24.5) {
				JOptionPane.showMessageDialog(null, "Seu índice de massa corporal (IMC) é: " + imc + "\nPeso ideal!");
			} else if (imc > 24.4 && imc < 29.9) {
				JOptionPane.showMessageDialog(null,
						"Seu índice de massa corporal (IMC) é: " + imc + "\nPré-obesidade!");
			} else if (imc > 29.9 && imc < 34.9) {
				JOptionPane.showMessageDialog(null,
						"Seu índice de massa corporal (IMC) é: " + imc + "\nObesidade classe I!");
			} else if (imc > 34.9 && imc < 39.9) {
				JOptionPane.showMessageDialog(null,
						"Seu índice de massa corporal (IMC) é: " + imc + "\nObesidade classe II(severa)!");
			} else {
				JOptionPane.showMessageDialog(null,
						"Seu índice de massa corporal (IMC) é: " + imc + "\nObesidade classe III(mórbida)!");
			}

		} catch (NumberFormatException erro) {

			JOptionPane.showMessageDialog(null,
					"Houve erro na conversão, digite apenas caracteres numéricos " + erro.toString());
		}

		System.exit(0);

	}

}
