package Aula4;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		/*
		 * Um casal possui três filhos: Marquinhos, Zezinho e Luluzinha. Faça um 
algoritmo para ler as idades dos filhos e exibir quem é o mais velho, o 
irmão do meio e o caçula da família. Suponha que não haja empates.
		 */
		System.out.println("Digite a idade em sequencia do Marquinhos, Zezinho e da Luluzinha");
		int marquinhos = entrada.nextInt();
		int zezinho = entrada.nextInt();
		int luluzinha = entrada.nextInt();
		
	if(marquinhos>zezinho && marquinhos>luluzinha && zezinho>luluzinha) {
		System.out.println(" Marquinhos é o mais velho, Zezinho é o do meio e Luluzinha a caçula");
	}else if(marquinhos<zezinho && marquinhos<luluzinha && zezinho>luluzinha) {
		System.out.println("Zezinho é o mais velho, Luluzinha do meio e Marquinhos o caçula");
	}else if (marquinhos>zezinho && marquinhos<luluzinha && zezinho<luluzinha){
		System.out.println("Luluzinha é a mais velha, Marquinhos o do meio e Zezinho o caçula");
	}else if(marquinhos<zezinho && marquinhos>luluzinha && zezinho>luluzinha){
		System.out.println("Zezinho é a mais velho, Marquinhos o do meio e Luluzinha o caçula");
	}else if(marquinhos<zezinho && marquinhos<luluzinha && zezinho<luluzinha){
		System.out.println("Luluzinha é a mais velha, Zezinho o do meio e Marquinhos o caçula");
	}else {
		System.out.println("Marquinhos é a mais velho, Luluzinha o do meio e Zezinho o caçula");
	}

}
}
