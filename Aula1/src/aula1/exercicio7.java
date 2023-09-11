package aula1;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		// Faça um programa que leia o nome de um vendedor, o seu salário fixo e
		//o total de vendas efetuadas por ele no mês (em dinheiro).
		//Sabendo que este vendedor ganha 15% de comissão sobre suas
		//vendas efetuadas, informar o total a receber no final do mês, com duas
		//casas decimais. 
		
Scanner entrada = new Scanner(System.in);
		
		
		double salario, vendas, comissao, total;
		String nome; 
		
		System.out.println("Informe seu nome?");
		nome = entrada.next();
		
		System.out.println("Digite o seu salario fixo?");
		salario = entrada.nextDouble();
		
		System.out.println("Qual foi o valor das suas vendas?");
		vendas = entrada.nextDouble();
						
		comissao = vendas * 0.15;
		total = comissao + salario;
		
		
		System.out.printf("O funcionario "+ nome + " recebera de salario com a comissão será de R$ " + total);

	}

}
