package Aula5;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio8 {

	
public static void main(String[] args) {
	Scanner entrada= new Scanner(System.in);
		/*
		 * Descreva um algoritmo que calcule e escreva a soma dos números 
pares e a soma dos números ímpares entre 1 e 1000
		 */
	int NUM_MAX= 1000;
	int valorPar =0;
	int valorImpar= 0 ;
	
	for (int i = 1; i <= NUM_MAX; i++) {
		if (i % 2 == 0) 
			valorPar =valorPar + i;
		else 
			valorImpar =valorImpar+ i;
	}
	System.out.println("ValorPar: " + valorPar + " - ValorImpar: " + valorImpar);
}
}




