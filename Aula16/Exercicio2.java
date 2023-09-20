package Aula16;

import java.util.Scanner;

public class Exercicio2 {

	public static void estacao() {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a estação escolhida sendo 1-verão, 2-outono, 3-inverno e 4 primavera");
	int clima=entrada.nextInt();
	switch (clima) {
	case 1:
		System.out.println("é Verão e o tempo está quente");
		break;
	case 2:
		System.out.println("é outono está morno");
		break;
	case 3:
		System.out.println("é primavera e esta florido");
		break;
	case 4:
		System.out.println("é inverno e esta frio");
		break;
	default: System.out.println("valor inexistente");
		break;
	}
	
	}
	
	public static void main(String[] args) {
		/*
		 * Faça um programa em que o usuário entre com um número de 1 a 4
Com o número 1 sendo verão, 2 sendo outono...
Dependendo de o que o usuário informa, printe:

É verão
E o tempo está quente

Ou

É inverno
E está frio
		 */
estacao();
	}

}
