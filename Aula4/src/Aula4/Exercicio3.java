package Aula4;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		/*
		 * Escreva um algoritmo que obtém do usuário 3 valores inteiros 
representando as três cartas deste usuário em uma mão de jogo de truco (1= AS; 2=2; 3=3; 
7=7; 11=Valete; 12= Dama; 13= Rei).
O algoritmo deve imprimir na tela a palavra “TRUCO” (se APENAS UMA das três cartas for AS, 2 ou 3), 
“SEIS” (se APENAS DUAS das três cartas for AS, 2 ou 3) ou “NOVE” (se AS TRÊS cartas forem AS, 
2 ou 3). Se não houver AS, 2 ou 3 nas três cartas, não é impresso nada*/

		System.out.println("Informe a primeira carta");
		int carta1 = entrada.nextInt();
		System.out.println("Informe a segunda carta");
		int carta2 = entrada.nextInt();
		System.out.println("Informe a terceira carta");
		int carta3 = entrada.nextInt();
		
		if (carta1 == Integer.valueOf("as") && carta2 == 2 && carta3 == 3 &&
				carta1 == 2 && carta2 == 3 && carta3 == Integer.valueOf("as") &&
				carta1 == 3 && carta2 == Integer.valueOf("as") && carta3 == 2) {
			System.out.println("Nove");
		}else if(carta1 == Integer.valueOf("as") && carta2 == 2 || carta3 == 3 &&
				carta1 == 2 && carta2 == 3 || carta3 == Integer.valueOf("as") &&
				carta1 == 3 && carta2 == Integer.valueOf("as") || carta3 == 2) {
			
		}

}
}
