package Aula4;

import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		
		/*
		 * Escreva um algoritmo para ler o ano de nascimento de 3 irmãos, 
escrever uma  mensagem que indique se eles são TRIGÊMEOS, GÊMEOS, APENAS 
IRMÃOS. 
Considere que eles são GÊMEOS se dois deles possuem a mesma 
idade e o outro diferente dos demais, e apenas irmãos se todas as idades forem 
diferentes.
		 */

		//entrada
		System.out.println("Informe o ano de nascimento do primeiro irmão");
		int irmao1 = entrada.nextInt();
		System.out.println("Informe o ano de nascimento do segundo irmão");
		int irmao2 = entrada.nextInt();
		System.out.println("Informe o ano de nascimento do terceiro irmão");
		int irmao3 = entrada.nextInt();
		
		//processo
		if(irmao1 == irmao2 && irmao1 == irmao3) {
			System.out.println("São trigemeos");
		}else if (irmao1 == irmao2 && irmao1 != irmao3 || irmao1 != irmao2 && irmao1 == irmao3 || irmao2 == irmao3 && irmao1 != irmao3) {
			System.out.println("são gemeos");
		}else {
			System.out.println("São apenas irmão ");
		}
	}

}
