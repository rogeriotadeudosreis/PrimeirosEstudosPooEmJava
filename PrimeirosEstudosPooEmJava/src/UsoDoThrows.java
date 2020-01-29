package Pacote_Exercicios_Java_7_Cap1aoCap4;

import java.io.*;
public class UsoDoThrows {

	public static void main(String[] args) throws IOException  {
		
		BufferedReader dado;
		System.out.println("Entre com seu nome: ");
		dado = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Seu nome é: " + dado.readLine());

		
	}

}
