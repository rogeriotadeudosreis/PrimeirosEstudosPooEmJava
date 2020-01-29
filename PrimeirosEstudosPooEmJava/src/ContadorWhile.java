package Pacote_Exercicios_Java_7_Cap1aoCap4;

import javax.swing.JOptionPane;
public class ContadorWhile {

	public static void main(String[] args) {

		try {
			
			int limite = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade; "));
			int contador = limite;
			
			while (contador >=0) {
				System.out.println(contador);
				contador --;				
			}
			System.out.println("Fim do contador regressivo\n");
			
			contador = 0;
			
			do {
				System.out.println(contador);
				contador ++;
				
			}while (contador <= limite);
			System.out.println("Fim do contador progressivo");		
			
		} catch (NumberFormatException erro) {
			System.out.println("N�o foi fornecido um n�mero inteiro v�lido\n" + erro.toString());
		}
		System.exit(0);
	}

}
