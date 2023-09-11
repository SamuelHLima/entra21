package Aula4;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		/*
		 * Dada a idade de um nadador descreva um algoritmo que o classifique 
em uma das seguintes categorias: 
pré-mirim 5 - 7 anos 
mirim 8 - 10 anos 
infantil 11 - 13 anos 
infanto-juvenil 14 - 17 anos 
juvenil 18 - 20 anos 
adulto maiores de 21 anos
		 */
		
		//entrada
		System.out.println("Digite a idade do nadador ");
		int idade = entrada.nextInt();
		
		if(idade>=5 && idade<=7) {
			System.out.println("Sua categoria é pré-mirim");
		}else if(idade>=8 && idade<=10) {
			System.out.println("Sua categoria é mirim");
			}else if(idade>=11 && idade<=14) {
				System.out.println("Sua categoria é infantil");
				}else if(idade>=14 && idade<=17) {
					System.out.println("Sua categoria é infanto-juvenil");
					}else if(idade>=18 && idade<=20) {
						System.out.println("Sua categoria é juvenil");
						}else if(idade>21) {
							System.out.println("Sua categoria é Adulto");
							}else {
								System.out.println("Idade menor que 5 anos, idade invalida");
							}

	}
}
