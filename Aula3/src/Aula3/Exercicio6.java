package Aula3;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que verifique (usando if e else) se uma letra digitada 
é vogal ou consoante.
		 */
			Scanner entrada= new Scanner(System.in);
			char Letra;
			 
			
			System.out.println("Digite a letra para verificação de vogal");
			Letra = entrada.next().charAt(0);
			
			if ( Letra == 'A' || Letra == 'E' || Letra == 'I'|| Letra == 'O' || Letra == 'U'||Letra == 'a' || Letra == 'e' || Letra == 'i'|| Letra == 'o' || Letra == 'u') {
				System.out.println("é vogal");
			}else {
				System.out.println("é consoante");
			}
		

	}

}
