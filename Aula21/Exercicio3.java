package Aula21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		/*
		 * Crie uma Array List O usuário vai colocando valores decimais até ele colocar
		 * o número 0. Calcular: a) Qual o menor número b) Qual o maior número c)
		 * Calcular a média
		 */

		
		
		double media = 0;
		double menor = Integer.MAX_VALUE;
		double maior = Integer.MIN_VALUE;
		double soma = 0;
		
		
		List<Double> Lista = new ArrayList<>();

		System.out.println("Digite um valor e zero para sair");
		double valor = entrada.nextDouble();

		

		while (valor != 0) {
			Lista.add(valor);
			soma += valor;
			if (valor < menor) {
				menor = valor;
			}
			if (valor > maior) {
				maior = valor;
			}
			System.out.println("digite 0 para sair");
			valor=entrada.nextDouble();
		}
		media = soma / Lista.size();
		System.out.println("O menor valor é " + menor);
		System.out.println("O maior valor é " + maior);
		System.out.println("A media dos valore é " + media);

	}

}
