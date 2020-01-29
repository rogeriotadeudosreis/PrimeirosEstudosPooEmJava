package Pacote_Exercicios_Java_7_Cap1aoCap4;

import javax.swing.JOptionPane;

public class Exercicio_5_if_com_else {

	public static void main(String[] args) {

		String aux = JOptionPane.showInputDialog("Forne�a um valor num�rico entre 0 e 10");

		if (aux != null) {

			try {

				float x = Float.parseFloat(aux);

				if (x >= 0 && x <= 10) {

					JOptionPane.showMessageDialog(null, "Nota = " + x + " valor v�lido");
				} else {
					JOptionPane.showMessageDialog(null, "Nota = " + x + " valor inv�lido");
				}

			} catch (NumberFormatException erro) {
				JOptionPane.showMessageDialog(null, "Digite apenas valores num�ricos - \n " + erro.toString());
			}
		}
		System.exit(0);

	}

}
