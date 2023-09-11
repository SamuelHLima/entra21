package aula6;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 * Crie 4 variáveis fora do For onde define se é m(mulher) e h(homem) e faça dois contador
		 *  que verifique quantas mulheres e homens são
		 */

		System.out.println("Informe 4 valores, sendo m(mulher) e h(homem");
	int contadorMulher =0;
	int contadorHomem =0;
	
	for(int i=0; i<4; i++) {
		String val = scan.next();
		if (val.equals("m")) {
			contadorMulher++;
		}else {
			contadorHomem++;
		}
	}
	System.out.println("mulheres: "+ contadorMulher);
	System.out.println("Homens "+  contadorHomem);
	
	}

}
