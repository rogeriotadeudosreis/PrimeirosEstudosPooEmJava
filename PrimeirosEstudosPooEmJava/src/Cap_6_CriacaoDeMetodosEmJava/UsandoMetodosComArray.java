package Cap_6_CriacaoDeMetodosEmJava;
public class UsandoMetodosComArray {

	public static void main(String[] args) {

		double[] numeros = { 12.4, 4, 3.4, 9, 7.3, 6.6 };
		double menor = MetodosComArray.buscaMenor(numeros); 
		double maior = MetodosComArray.buscaMaior(numeros);
		double soma = MetodosComArray.somaNumeros(numeros);
		System.out.println("O maior valor é: " + maior);
		System.out.println("O menor valor é: " + menor);
		System.out.println("A soma dos elementos desse array é: " + soma);
		
		System.out.println();

		String[] nomes = { "Ivone", "Carlos", "Lila", "Alzira", "Bruno", "Fabio", "Rita", "Rogério" };
		String[] retorno = MetodosComArray.ordenaPalavras(nomes);
		for (int i = 0; i < retorno.length; i++) {
			System.out.println(retorno[i]);

		}

	}

}
