package Cap_7_Java_7_orientacaoObjetos;

import javax.swing.JOptionPane;

public class Garrafa_usandoGetSet {
	private String tipoMaterial;
	private int capacidade;

	public String getTipoMaterial() {
		return tipoMaterial;
	}

	public void setTipoMaterial(String tipoMaterial) {
		this.tipoMaterial = tipoMaterial;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public void mostrarConteudo() {
		JOptionPane.showMessageDialog(null, "Material: " + this.tipoMaterial + "\nCapacidade: " + getCapacidade());
	}

}
