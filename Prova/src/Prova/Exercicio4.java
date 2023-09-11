package Prova;

import java.util.Iterator;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		/*
		 * Um aluno se vê com necessidade de ajuda na aula e logo tem a ideia de um algoritmo, 
pensando nisso, ele descreve como deve funcionar: o usuário seleciona a opção onde 
1) Solicita 3 notas e calcula a média, 
2) Retorna os dados do aluno em questão (informe seu nome e e-mail), 
3) Solicita 5 valores, verifica e retorna qual é o maior e o menor. 
 A opção 0 encerra o programa e qualquer outra é declarada como inválida, além disso, informe 
quantas vezes o usuário escolheu opções válidas antes de encerrar o programa e quantas inválidas. 
		 */

		System.out.println("Digite seu Nome e email");
		String nome=entrada.next();
		String email=entrada.next();
		int contaValida = 0;
		int contaInvalida = 0;
		
		int valor=0;
		int encerrar;
		do {
		System.out.println("Digite a opcao desejada");
		int opcao=entrada.nextInt();
		
		switch (opcao) {
		case 1:
			contaValida++;
			for (int i = 1; i <= 3; i++) {
				System.out.println("Digite a altura de 3 notas");
				int notas=entrada.nextInt();
				valor += notas;
			}
			double media =(valor/3);
			System.out.println("A media de altura é "+ media);
			break;
		case 2:
			contaValida++;
			System.out.println("seu nome é "+nome+" e seu email é\n"+email);
			break;
		case 3:
			contaValida++;
			int maior = Integer.MIN_VALUE;
			int menor = Integer.MAX_VALUE;
			
			int valorx=0;
			for (int i = 0; i < 5; i++) {
				System.out.println("Informe um valor");
				valorx = entrada.nextInt();
				
				if(valorx >maior) {
					maior =valor;
					menor=valor;
				}
			}
			System.out.println("O menor valor é:" +menor);
			System.out.println("O maior valor é:" +maior);
			break;

		default:
			System.out.println("Valor invalido");
			contaInvalida++;
			break;
		}
		System.out.print("Digite 0 para encerrar, ou qualquer outro valor para continuar ");
	    encerrar = entrada.nextInt();
	    
	}
	while (encerrar != 0);
	System.out.println("Programa encerrado.");
	System.out.println("Opçãos invalidas" + contaInvalida);
	System.out.println("Opçãos invalidas" + contaValida);
}
}
	
