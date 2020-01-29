package Pacote_Exercicios_Java_7_Cap1aoCap4;

import javax.swing.JOptionPane;

public class AprendendoUsarCaixaDeDialogoComJOptionPane {
	
	public static void main(String args[]) {

		// Criando um cardápio de pizzas com JOptionPane

		float valorpizza = 25.00f;
		int qtde = 0;
		String[] pizzas = { "Mussarela", "Peperone", "Portuguesa", "Quatro Queijos" };

		String escolha = (String) JOptionPane.showInputDialog(null, "Selecione a pizza desejada", "Sabores de Pizza",
				JOptionPane.QUESTION_MESSAGE, null, pizzas, pizzas[0]);

		String auxqtde = JOptionPane.showInputDialog("Informe a quantidade");
		qtde = Integer.parseInt(auxqtde);
		
		float valorTotal = qtde * valorpizza;

		JOptionPane.showMessageDialog(null, "Ótimo escolha ! " + escolha + "\nQuantidade: " + qtde + "\nValor a pagar: " + valorTotal);
		
		System.exit(0);
	}

}
