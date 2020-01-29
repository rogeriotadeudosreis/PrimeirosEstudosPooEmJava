package Pacote_Exercicios_Java_7_Cap1aoCap4;

import javax.swing.JOptionPane;

public class TryCatch {

	public static void main(String[] args) {

		String aux1 = JOptionPane.showInputDialog("Forneça o valor do 1º número: ");
		if (aux1 == null) {
			System.exit(0);
		}

		String aux2 = JOptionPane.showInputDialog("Forneça o valor do 2º número: ");
		if (aux2 == null) {
			System.exit(0);
		}

		try {
			int num1 = Integer.parseInt(aux1);
			int num2 = Integer.parseInt(aux2);
			JOptionPane.showMessageDialog(null, "Soma = " + (num1 + num2) + "\nSubtração = " + (num1 - num2)  
					+ "\nMultiplicação = " + (num1 * num2) + "\nDivisão = " + (num1 / num2));
			JOptionPane.showMessageDialog(null, "Subtração = " + (num1 - num2));
			JOptionPane.showMessageDialog(null, "Multiplicação = " + (num1 * num2));
			JOptionPane.showMessageDialog(null, "Divisão = " + (num1 / num2));

			// Observações > pode-se também tratar mais de uma exceção em um único catch
			// Colocando-as dentro do mesmo parenteses separadas por pipe |
			// Exemplo deste caso abaixo:
			// catch (ArithmeticException | NumberFormatEsception erro)
		} catch (ArithmeticException erro) {

			JOptionPane.showMessageDialog(null, "Erro de divisão por zero!\n" + erro.toString(), "Erro",
					JOptionPane.ERROR_MESSAGE);
		} catch (NumberFormatException erro) {
			JOptionPane.showMessageDialog(null, "Digite apenas números inteiros!\n" + erro.toString(), "Erro",
					JOptionPane.ERROR_MESSAGE);
		}
		finally {
			JOptionPane.showMessageDialog(null, "Final da execução");
		}
		System.exit(0);

	}

}
