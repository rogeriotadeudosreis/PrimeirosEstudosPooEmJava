package Pacote_Exercicios_Java_7_Cap1aoCap4;

import javax.swing.JOptionPane;

public class InstrucaoThrows {

	public static void main(String[] args) {

		float nota = Float.parseFloat(JOptionPane.showInputDialog("Forneça uma nota entre 0 e 10"));

		try {
			if (nota < 0 || nota > 10) {
				throw new Exception("Fora da faixa permitida (0 a 10)");
			}

			// continuar a execução normalmente

		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, erro.toString());
		}
		System.exit(0);
	}

}
