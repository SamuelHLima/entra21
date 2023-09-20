package Aula13;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * Crie uma matriz com 12 linhas e 2 colunas A primeira coluna corresponde aos
		 * meses do ano A segunda corresponde ao lucro que a loja teve Posteriormente,
		 * imprima qual mês teve maior e menor lucro e valor
		 */

		String[][] matriz = {
				{ "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro",
						"Novembro", "Dezembro" },
				{ "1000.0", "1500.0", "800.0", "2000.0", "2500.0", "3000.0", "1800.0", "2200.0", "2800.0", "3200.0",
						"900.0", "1300.0" } };

		int mesMaiorLucro = 0;
		int mesMenorLucro = 0;
		// converter o tipo
		double maiorLucro = Double.parseDouble(matriz[1][0]);
		double menorLucro = Double.parseDouble(matriz[1][0]);

		for (int i = 1; i < matriz[1].length; i++) {
			double lucroAtual = Double.parseDouble(matriz[1][i]);
			if (lucroAtual > maiorLucro) {
				maiorLucro = lucroAtual;
				mesMaiorLucro = i;
			}
			if (lucroAtual < menorLucro) {
				menorLucro = lucroAtual;
				mesMenorLucro = i;
			}
		}

		System.out.println("Mês com o maior lucro: " + matriz[0][mesMaiorLucro]);
		System.out.println("Valor do maior lucro: R$" + maiorLucro);

		System.out.println("Mês com o menor lucro: " + matriz[0][mesMenorLucro]);
		System.out.println("Valor do menor lucro: R$" + menorLucro);
	}
}