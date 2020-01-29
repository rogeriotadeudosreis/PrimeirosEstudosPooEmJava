package Cap_6_CriacaoDeMetodosEmJava;

// Exercício sobre criação de método dos vídeos Java
public class DataTeste {

	public static void main(String[] args) {

		Data nascimento = new Data();
		nascimento.dia = 28;
		nascimento.mes = 11;
		nascimento.ano = 1972;
		
		Data casamento = new Data();
		
		casamento.dia = 12;
		casamento.mes = 01;
		casamento.ano = 2017;

		System.out.println(nascimento.formatar());
System.out.println(casamento.formatar());
	}

}
