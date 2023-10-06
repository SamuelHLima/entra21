package aula18;

import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		        Scanner scanner = new Scanner(System.in);

		        // Solicita ao usuário que insira três valores
		        System.out.print("Digite o primeiro valor: ");
		        double valor1 = scanner.nextDouble();

		        System.out.print("Digite o segundo valor: ");
		        double valor2 = scanner.nextDouble();

		        System.out.print("Digite o terceiro valor: ");
		        double valor3 = scanner.nextDouble();

		        // Encontra o maior valor
		        double maior = Math.max(Math.max(valor1, valor2), valor3);

		        // Encontra o menor valor
		        double menor = Math.min(Math.min(valor1, valor2), valor3);

		        // Encontra o valor do meio
		        double meio = valor1 + valor2 + valor3 - maior - menor;

		        // Exibe os resultados
		        System.out.println("Maior valor: " + maior);
		        System.out.println("Menor valor: " + menor);
		        System.out.println("Valor do meio: " + meio);

		        scanner.close();
		    }
		

	}


