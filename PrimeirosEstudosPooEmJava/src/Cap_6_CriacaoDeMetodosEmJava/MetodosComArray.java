package Cap_6_CriacaoDeMetodosEmJava;

import java.util.*;

public class MetodosComArray {
	static double maior = 0;
	static double menor = 0;
	static double soma = 0;

	/**
	 * Recebe um arrays de números e retorna o maior deles. deve conter pelo menos
	 * um elemento no arrays senão gera erro parametro números = os números a serem
	 * comparados return = o maior número ou menor com a classe Math.min
	 */
	public static double buscaMaior(double[] numeros) {
		maior = numeros[0];
		for (int i = 1; i < numeros.length; i++) {
			maior = Math.max(maior, numeros[i]);
		}
		return maior;
	}

	public static double buscaMenor(double[] numeros) {
		menor = numeros[0];
		for (int i = 1; i < numeros.length; i++) {
			menor = Math.min(menor, numeros[i]);
		}
		return menor;
	}

	public static double somaNumeros(double[] numeros) {

		for (int i = 1; i < numeros.length; i++) {
			soma += numeros[i];
		}
		return soma;
	}

	/**
	 * recebe um array de palavras e retorna ordenados em ordem crescente parametro
	 * palavras = as palavras a serem ordenadas return = o array ordenado
	 */

	public static String[] ordenaPalavras(String[] palavras) {
		Arrays.sort(palavras);
		return palavras;
	}
}
