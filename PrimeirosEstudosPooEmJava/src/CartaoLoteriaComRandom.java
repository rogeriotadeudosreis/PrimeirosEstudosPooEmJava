package Pacote_Exercicios_Java_7_Cap1aoCap4;

import javax.swing.JOptionPane;

public class CartaoLoteriaComRandom {

	public static void main(String[] args) {

		for (int cartao = 1; cartao <= 4; cartao++) {

			String numerosCartao = "";

			for (int numCartao = 1; numCartao <= 6; numCartao++) {

				int num = (int) (Math.random() * 100);
				numerosCartao = numerosCartao + num + "   ";
			}

			JOptionPane.showMessageDialog(null, "Números do cartão: " + cartao + "\n" + numerosCartao);

		}
		System.exit(0);

	}

}
