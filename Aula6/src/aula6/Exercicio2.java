package aula6;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		/*
		 * Faça um programa, 
		 * utilizando for, que peça para o usuário inserir um número N e mostre na tela todos os números ímpares até N. 
		 */	
		    
		System.out.println("Digite um numero");
		int num = entrada.nextInt(); 
		
		
		        for (int i=0; i<=num; i++) {
		            
		            if (i % 2 != 0) {
		                System.out.println(i);
		                
		            }
		        }
		    }
		//for(int i=1; i <= n;i +=2){
	// System.out.println(i);
		
		
	}

