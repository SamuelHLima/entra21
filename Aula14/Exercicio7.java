package Aula14;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		/*
		 * Crie essa matriz:
		 * 
		 * 2104 3 399900
		 * 
		 * 1600 3 329900
		 * 
		 * 2400 3 369000
		 * 
		 * 1416 2 232000
		 * 
		 * 3000 4 539900
		 * 
		 * 1985 4 299900
		 * 
		 * 1534 3 314900
		 * 
		 * 1427 3 199000
		 * 
		 * 1380 3 212000
		 * 
		 * 1494 3 242500
		 * 
		 * 1940 4 240000
		 * 
		 * 2000 3 347000
		 * 
		 * 1890 3 330000
		 * 
		 * 4478 5 699900
		 * 
		 * 1268 3 259900
		 * 
		 * 
		 * A primeira coluna é o tamanho da casa
		 * 
		 * A segunda coluna é a quantidade de quartos
		 * 
		 * A terceira coluna é o preço
		 * 
		 * Determinar:
		 * 
		 * a) Qual é a média dos preços das casas?
		 * 
		 * b) Quanto custa a menor casa? E quantos quartos tem a casa mais cara?
		 * 
		 * c) Qual a diferença de tamanho da casa com o maior número de quartos para a
		 * casa com o menor número de quartos?
		 */

		int[][] matriz = new int[][] { { 2104, 3, 399900 }, { 1600, 3, 329900 }, { 2400, 3, 369000 },
				{ 1416, 2, 232000 }, { 3000, 4, 539900 }, { 1985, 4, 299900 }, { 1534, 3, 314900 }, { 1427, 3, 199000 },
				{ 1380, 3, 212000 }, { 1494, 3, 242500 }, { 1940, 4, 240000 }, { 2000, 3, 347000 }, { 1890, 3, 330000 },
				{ 4478, 5, 699900 }, { 1268, 3, 259900 } };

		double media = 0;
		int preco = 0;

		// letra a
		for (int i = 0; i < matriz.length; i++) {
			preco += matriz[i][2];
		}
		media = preco / matriz.length;
		System.out.println("A media de preço é "+media);
//Letra b
		int custoMenorCasa = matriz[0][2];
		int valorMenorCasa=0;
		for (int i = 1; i < matriz.length; i++) {
			if (matriz[i][0] < custoMenorCasa) {
				custoMenorCasa = matriz[i][0];
				valorMenorCasa = matriz[i][2];
			}
		}
		System.out.println("O valor da menor casa é "+valorMenorCasa);
//Letra B1
		int casaCara = 0;
		int precoAlto = matriz[0][2];
		for (int i = 0; i < matriz.length; i++) {
			if (matriz[i][2] > precoAlto) {
				precoAlto = matriz[i][2];
				casaCara = i;
			}
		}
		int quartosCasaCara = matriz[casaCara][1];
		System.out.println(" A casa mais cara tem "+quartosCasaCara+" Quartos");
//letra C
		int maiorQuantidadeQuartos = matriz[0][1];
		int menorQuantidadeQuartos = matriz[0][1];
		for (int i = 0; i < matriz.length; i++) {
			if (matriz[i][1] > maiorQuantidadeQuartos) {
				maiorQuantidadeQuartos = matriz[i][1];
			}
			if (matriz[i][1] < menorQuantidadeQuartos) {
				menorQuantidadeQuartos = matriz[i][1];
			}
		}
		int diferenca = maiorQuantidadeQuartos - menorQuantidadeQuartos;
		System.out.println(diferenca);
	}
}
