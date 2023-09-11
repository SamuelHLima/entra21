package Aula3;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		/*
		 * 3. Faça um programa que pergunte o preço de três produtos e informe qual 
produto você deve comprar, sabendo que a decisão é sempre o mais 
barato.
		 */
		
		Scanner entrada= new Scanner(System.in);
		
    	//entrada
		System.out.println("Informe o valor 1");
		double valorUm = entrada.nextDouble();
		System.out.println("Informe o valor 2");
		double valorDois = entrada.nextDouble();
		System.out.println("Informe o valor 3");
		double valorTres = entrada.nextDouble();
		
		String qualProdutoComprar ="";
		//processo
		if(valorUm < valorDois && valorUm < valorTres) {
			qualProdutoComprar = "Produto 1";
		}else if (valorDois < valorTres) {
			qualProdutoComprar ="Produto 2";
		}else {
			qualProdutoComprar="Produto 3";
		}
//saida
		System.out.println("O produto que deve comprar é " + qualProdutoComprar);
	}

}
