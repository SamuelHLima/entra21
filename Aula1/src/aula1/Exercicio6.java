package aula1;


import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// Escreva um programa que leia o numero de um funcionario, seu numero de horas trabalhadas, o valor
		//que recebe por hora e calcule o salario desse funcionario. a seguir, mostre o numero e o salario do funcioanrio com duas casas decimais
		
		Scanner entrada = new Scanner(System.in);
		
		
		double valor,salario;
		int cadastro, horas;
		
		System.out.println("Digite o seu cadastro?");
		cadastro = entrada.nextInt();
		
		System.out.println("Digite a quantidade de horas que voce trabalha?");
		horas = entrada.nextInt();
		
		System.out.println("Digite qua o valor da sua hora trabalhada?");
		valor = entrada.nextDouble();
						
		salario = horas * valor;
		
		System.out.printf("Cadastro numero %d , seu salario é %.2f", cadastro, salario);
	}

}
