package Pacote_Exercicios_Java_7_Cap1aoCap4;

import javax.swing.JOptionPane;

public class Exercicio_3_if_Sem_else {

	public static void main(String[] args) {

		// Exercício de estrutura condicional apenas com um if
		String resposta = JOptionPane.showInputDialog("Forneça sua resposta: S (Sim) ou N (Não)");
		String men = "Letra fornecida: " + resposta;

		if (!resposta.equals("S") && !resposta.equals("N")) {
			men = men + " é inválida";
		}
		JOptionPane.showMessageDialog(null, men);
		System.exit(0);	
	}

}
