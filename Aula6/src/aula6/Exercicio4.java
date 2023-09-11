package aula6;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		/*
		 * Crie um programa para ler 3 notas e mostrar a 
	média delas.
		 */

		int valor=0;
		for (int i=1; i<=4; i++) {
        	System.out.println("Digite 3 notas");
    		int num = teclado.nextInt();
    		valor = num;
    		valor =valor + i;
		}
		
		
		
		double media = (valor/3); 
		System.out.println( "a media dos alunos é " + media);
    }
		
	}


