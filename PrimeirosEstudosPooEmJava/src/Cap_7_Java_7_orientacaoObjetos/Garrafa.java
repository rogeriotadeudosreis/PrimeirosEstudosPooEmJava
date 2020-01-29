package Cap_7_Java_7_orientacaoObjetos;

import javax.swing.JOptionPane;

public class Garrafa {

	public String tipoMaterial;
	private int capacidade;
	public String tipoLiquido;

	public void encher() {
		System.out.println("Enchendo a garrafa");
	}

	public void esvaziar() {
		System.out.println("Esvaziando a garrafa");
	}

	public void mostrarConteudo() {
		System.out.println("Material: " + tipoMaterial + "	\nCapacidade: " + capacidade + 
				"\nLiquido: " + tipoLiquido);
	}
	public static String leString() {
		String aux = JOptionPane.showInputDialog("Forneça o tipo de líquido: ");
		return aux;
	}
}
