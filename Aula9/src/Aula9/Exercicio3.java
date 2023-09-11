package Aula9;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		/*
		 * Faça um algoritmo em que quem preenche os valores do vetor
		 *  é o usuário, por fim printe o vetor (vetor de 5 posições).
		 */
		
		String[] valores=new String [5];
		
		for (int i = 0; i < valores.length; i++) {
			System.out.println("Digite 5 nomes");
			valores[i]=entrada.next();
			
		}
		for (int i = 0; i < valores.length; i++) {
			System.out.println(valores[i]);	 
		}
			
		}
			
       
        }
    


