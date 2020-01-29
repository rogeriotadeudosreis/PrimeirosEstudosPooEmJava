package Cap_7_Java_7_orientacaoObjetos;

import javax.swing.JOptionPane;

public class Moto {

	private String marca;
	private String modelo;
	private String cor;
	private String proprietario;
	private int idadeProprietario;
	private int cilindrada;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public int getIdadeProprietario() {
		return idadeProprietario;
	}

	public void setIdadeProprietario(int idadeProprietario) {
		this.idadeProprietario = idadeProprietario;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public void mostrarDadosMoto() {
		JOptionPane.showMessageDialog(null,
				"Marca: " + getMarca() + "\nModelo: " + getModelo() + "\nCor: " + getCor() + "Proprietário: "
						+ getProprietario() + "\nCilindrada: " + getCilindrada() + "\nIdade do proprietário: "
						+ getIdadeProprietario());
	}

}
