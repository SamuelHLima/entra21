package Aula3;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		/*
		 * Para doar sangue é necessário ter entre 18 e 67 anos. Faça um 
aplicativo que pergunte a idade de uma pessoa e diga se ela pode doar 
sangue ou não. Use alguns dos operadores lógicos OU (||) e E (&&).
		 */
		
		Scanner entrada= new Scanner(System.in);
		
    	int Idade;
    	
    	System.out.println("Digite a sua idade para verificar se pode doar sangue");
    	Idade = entrada.nextInt();
    	
    	if (Idade >= 18 && Idade <= 67) {
    		System.out.println("Voce pode doar sangue");
    	}else {
    		System.out.println("Voce não pode doar sangue");
    	}

	}

}
