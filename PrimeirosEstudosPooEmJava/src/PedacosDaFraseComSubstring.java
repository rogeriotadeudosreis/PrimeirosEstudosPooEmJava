package Pacote_Exercicios_Java_7_Cap1aoCap4;

import javax.swing.JOptionPane;
public class PedacosDaFraseComSubstring {

	public static void main(String[] args) {
		
		try {
			String frase = JOptionPane.showInputDialog("Forneça uma frase");
			
			JOptionPane.showMessageDialog(null, " Frase " + frase.toUpperCase() + 
					"\n(0,2)" + frase.substring(0,2) + 
					"\n(3,8)" + frase.substring(3,8) + 
					"\n(9,11)" + frase.substring(9,11) + 
					"\n(12,16)" + frase.substring(12,16));
			
		} catch (StringIndexOutOfBoundsException erro) {
			JOptionPane.showMessageDialog(null, "A frase deve conter pelo menos 15 caracteres \n" + 
		erro.toString());
		}
		
		System.exit(0);

	}

}
