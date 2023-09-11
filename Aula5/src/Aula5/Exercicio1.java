package Aula5;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		// caso tenha uma escolha de fundamental II e queira separar
		// os alunos por sala
		System.out.println("Sala");
		int salaAluno = entrada.nextInt();
		
		switch (salaAluno) {
		case 7:
			System.out.println("Setimo ano");
			break;
		case 6:
			System.out.println("Sexto ano");
			break;
		case 8:
			System.out.println("Oitavo ano");
			break;
		case 9:
			System.out.println("nono ano");
			break;

		default:
			System.out.println("Valor invalido");
			break;
		}
	}

}
