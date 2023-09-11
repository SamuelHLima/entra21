package Aula3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que pergunte em que turno você estuda. Peça para 
digitar M-matutino ou V-vespertino ou N-noturno. Imprima a mensagem 
“Bom dia!” ou “Boa Noite” ou “Valor inválido”, conforme o caso.
		 */
		
		Scanner entrada= new Scanner(System.in);
		char turno;
    		
		System.out.println("Informe o turno que voce estuda, com M para matutino, V para vespertino ou N para noturno");
		turno = entrada.next().charAt(0);
		
		
		if (turno == 'M' || turno == 'm')  {
			System.out.println(" Bom dia");
		}else if  (turno == 'V'|| turno == 'v') {
			System.out.println("Boa tarde ");

		}else if (turno == 'N' || turno == 'n') {
			System.out.println("Boa noite");
		}
		else{
			System.out.println("Valor inválido");
		}
	


	}

}
