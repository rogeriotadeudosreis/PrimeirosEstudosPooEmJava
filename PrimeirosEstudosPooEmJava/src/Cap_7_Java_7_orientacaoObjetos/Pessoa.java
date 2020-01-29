package Cap_7_Java_7_orientacaoObjetos;

import javax.swing.JOptionPane;

public class Pessoa {

	private String nome;
	private int idade;
	private String estadoCivil;
	private String naturalidade;
	private String profissao;
	private long cpf;
	private long rg;
	private int tempoProfissao;
	private String nomePai;
	private String nomeMae;
	private String conjuge;
	private String escolaridade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public long getRg() {
		return rg;
	}

	public void setRg(long rg) {
		this.rg = rg;
	}

	public int getTempoProfissao() {
		return tempoProfissao;
	}

	public void setTempoProfissao(int tempoProfissao) {
		this.tempoProfissao = tempoProfissao;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getConjuge() {
		return conjuge;
	}

	public void setConjuge(String conjuge) {
		this.conjuge = conjuge;
	}

	public String getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}

	public Pessoa() {

	}

	public Pessoa(String nome, int idade, String estadoCivil, String naturalidade, String profissao, long cpf, long rg,
			int tempoProfissao, String nomePai, String nomeMae, String conjuge, String escolaridade
			) {
		super();
		this.nome = JOptionPane.showInputDialog("Forneça seu nome");
		String auxIdade = JOptionPane.showInputDialog("Informe sua idade");
		this.idade = Integer.parseInt(auxIdade);
		this.estadoCivil = JOptionPane.showInputDialog("Informe seu estado civil");
		this.naturalidade = JOptionPane.showInputDialog("Informe sua naturalidade");
		this.profissao = JOptionPane.showInputDialog("Informe sua profissão");
		String auxCpf = JOptionPane.showInputDialog("Informe seu CPF");
		this.cpf = Integer.parseInt(auxCpf);
		String auxRg = JOptionPane.showInputDialog("Informe seu RG");
		this.rg = Integer.parseInt(auxRg);
		String auxTempoProfissao = JOptionPane.showInputDialog("Informe seu tempo de profissão");
		this.tempoProfissao = Integer.parseInt(auxTempoProfissao);
		this.nomePai = JOptionPane.showInputDialog("Informe nome do pai");
		this.nomeMae = JOptionPane.showInputDialog("Informe o nome da mãe");
		this.conjuge = JOptionPane.showInputDialog("Informe o nome do cônjuge");
		this.escolaridade = JOptionPane.showInputDialog("Informe sua escolaridade");

	}

	public void mostrarDadosPessoais() {
		JOptionPane.showMessageDialog(null,
				"\t- Dados Pessoais -\n\nNome: " + getNome() + "\nIdade: " + getIdade() + "\nEstado civil: "
						+ getEstadoCivil() + "\nNaturalidade: " + getNaturalidade() + "\nProfissão: " + getProfissao()
						+ "\nCPF: " + getCpf() + "\nRG: " + getRg() + "\nTempo de profissão: " + getTempoProfissao()
						+ "\nNome do pai: " + getNomePai() + "\nNome da mãe: " + getNomeMae() + "\nConjuge: "
						+ getConjuge() + "\nEscolaridade: " + getEscolaridade()  );
	}

}
