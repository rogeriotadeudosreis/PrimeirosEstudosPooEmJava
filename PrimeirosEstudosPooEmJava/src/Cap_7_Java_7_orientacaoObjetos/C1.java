package Cap_7_Java_7_orientacaoObjetos;

public class C1 {
	
	private String nome;
	private int idade;
	
	
	
	public C1(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}



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



	public int soma (int a, int b) {
		return (a+b);
	}
	

}
