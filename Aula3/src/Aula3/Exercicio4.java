package Aula3;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que verifique (usando if e else) se uma letra digitada 
é “F” ou “M”. Conforme a letra escrever: F – Feminino, M- Masculino, 
Sexo inválido.
		 */

		Scanner entrada= new Scanner(System.in);
		char Sexo;
    		
		System.out.println("Informe o seu sexo sendo M para masculino e F para feminino");
		Sexo = entrada.next().charAt(0);
		
		
		if (Sexo == 'M' || Sexo == 'm')  {
			System.out.println(" Sexo Masculino");
		}else if  (Sexo == 'F'|| Sexo == 'f') {
			System.out.println("Sexo Feminino");

		}else{
			System.out.println("Valor inválido");
		}
	


	}
	}


