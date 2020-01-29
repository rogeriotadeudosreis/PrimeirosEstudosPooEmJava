package Cap_7_Java_7_orientacaoObjetos;

import javax.swing.JOptionPane;

public class Endereco {

	private String rua;
	private String quadra;
	private int numero;
	private int lote;
	private String bairro;
	private String cep;
	private String cidade;
	private String estado;
	private String pontoReferencia;

	public Endereco() {

	}

	public Endereco(String rua, String quadra, int numero, int lote, String bairro, String cep, String cidade,
			String estado, String pontoReferencia) {
		super();
		this.rua = rua;
		this.quadra = quadra;
		this.numero = numero;
		this.lote = lote;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
		this.pontoReferencia = pontoReferencia;
	}

	public void setPontoReferencia(String pontoReferencia) {
		this.pontoReferencia = pontoReferencia;
	}

	public String getPontoReferencia() {
		return pontoReferencia;

	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getQuadra() {
		return quadra;
	}

	public void setQuadra(String quadra) {
		this.quadra = quadra;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getLote() {
		return lote;
	}

	public void setLote(int lote) {
		this.lote = lote;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void mostrarDadosEndereco() {
		JOptionPane.showMessageDialog(null,
				"Dados Pessoais\n\n" + getRua() + "\nQuadra: " + getQuadra() + "\nNúmero: " + getNumero() + "\nLote: "
						+ getLote() + "\nBairro: " + getBairro() + "\nCep: " + getCep() + "\nCidade: " + getCidade()
						+ "\nEstado: " + getEstado() + "\nPonto de referência: " + getPontoReferencia());

	}
}
