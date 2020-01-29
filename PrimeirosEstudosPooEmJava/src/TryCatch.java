package Pacote_Exercicios_Java_7_Cap1aoCap4;

import javax.swing.JOptionPane;

public class TryCatch {

	public static void main(String[] args) {

		String aux1 = JOptionPane.showInputDialog("Forne�a o valor do 1� n�mero: ");
		if (aux1 == null) {
			System.exit(0);
		}

		String aux2 = JOptionPane.showInputDialog("Forne�a o valor do 2� n�mero: ");
		if (aux2 == null) {
			System.exit(0);
		}

		try {
			int num1 = Integer.parseInt(aux1);
			int num2 = Integer.parseInt(aux2);
			JOptionPane.showMessageDialog(null, "Soma = " + (num1 + num2) + "\nSubtra��o = " + (num1 - num2)  
					+ "\nMultiplica��o = " + (num1 * num2) + "\nDivis�o = " + (num1 / num2));
			JOptionPane.showMessageDialog(null, "Subtra��o = " + (num1 - num2));
			JOptionPane.showMessageDialog(null, "Multiplica��o = " + (num1 * num2));
			JOptionPane.showMessageDialog(null, "Divis�o = " + (num1 / num2));

			// Observa��es > pode-se tamb�m tratar mais de uma exce��o em um �nico catch
			// Colocando-as dentro do mesmo parenteses separadas por pipe |
			// Exemplo deste caso abaixo:
			// catch (ArithmeticException | NumberFormatEsception erro)
		} catch (ArithmeticException erro) {

			JOptionPane.showMessageDialog(null, "Erro de divis�o por zero!\n" + erro.toString(), "Erro",
					JOptionPane.ERROR_MESSAGE);
		} catch (NumberFormatException erro) {
			JOptionPane.showMessageDialog(null, "Digite apenas n�meros inteiros!\n" + erro.toString(), "Erro",
					JOptionPane.ERROR_MESSAGE);
		}
		finally {
			JOptionPane.showMessageDialog(null, "Final da execu��o");
		}
		System.exit(0);

	}

}
