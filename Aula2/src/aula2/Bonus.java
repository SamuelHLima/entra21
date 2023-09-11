package aula2;

import java.util.Scanner;

public class Bonus {
public static void main(String[] args) {
	Scanner entrada= new Scanner(System.in);
	int a;
	
	
	System.out.println("Digite valor para verificar se é par ou impar?");
	a = entrada.nextInt();
	
	
	
	
	if (a % 2 == 0) {
		System.out.println(" O é par");
	} else {
		System.out.println("O numero é impar ");
}
}
}
