package Aula3;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/*
		 *  Faça um programa que recebe a nota do aluno e retorna: 
A mensagem “Aprovado”, se a média alcançada for maior ou igual a 
sete; 
A mensagem “Aprovado com Distinção”, se a média for igual a dez; 
A mensagem “Reprovado” se a média for menor de do que sete;
		 */
		Scanner entrada= new Scanner(System.in);
		float nota1,nota2,nota3, media;
    	int frequencia;
		
		System.out.println("Informe a primeira nota do aluno entre 1 a 10");
		nota1 = entrada.nextFloat();
		System.out.println("Informe a segunda nota do aluno entre 1 a 10");
		nota2 = entrada.nextFloat();
		System.out.println("Informe a terceira nota do aluno entre 1 a 10");
		nota3 = entrada.nextFloat();
		System.out.println("Informe a frequencia do aluno");
		frequencia = entrada.nextInt();
		
		media = (nota1+nota2+nota3)/3;
		
		if (media >= 7 && frequencia >= 75 )  {
			System.out.println(" Aprovado");
		}else if  (media >= 10 && frequencia >= 75) {
			System.out.println("Aprovado com Distinção");

		}else {
			System.out.println("Reprovado");
		}
	


	}
	
	}


