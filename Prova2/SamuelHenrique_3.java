package Prova2;

import java.util.Scanner;

public class SamuelHenrique_3 {

	public static void main(String[] args) {

		double matriz[][] = {
				{ 22.1, 23.5, 24.0, 23.8, 22.6, 21.9, 21.7, 22.2, 23.0, 24.1, 24.5, 24.0, 24.3, 24.4, 24.0, 24.5, 24.1,
						24.4, 24.8, 24.5, 24.3, 24.7, 24.9, 23.8 },
				{ 21.8, 22.7, 23.2, 23.9, 23.7, 22.8, 22.5, 22.1, 22.9, 24.0, 24.6, 25.1, 26.2, 27.5, 28.1, 28.6, 29.2,
						29.5, 28.9, 27.6, 26.4, 25.8, 25.1, 24.0 },
				{ 20.7, 21.0, 21.5, 22.1, 22.5, 22.7, 22.9, 23.1, 23.5, 23.9, 24.2, 24.6, 25.0, 25.3, 25.6, 25.9, 26.2,
						26.5, 26.8, 27.1, 27.4, 27.7, 27.9, 27.8 },
				{ 20.2, 20.5, 21.0, 21.4, 21.8, 22.2, 22.5, 22.8, 23.1, 23.3, 23.6, 23.9, 24.2, 24.5, 24.8, 25.1, 25.4,
						25.7, 26.0, 26.3, 26.6, 26.9, 27.1, 27.2 },
				{ 19.8, 20.0, 20.3, 20.7, 21.1, 21.4, 21.8, 22.1, 22.4, 22.7, 23.0, 23.3, 23.6, 23.9, 24.2, 24.5, 24.8,
						25.1, 25.4, 25.7, 26.0, 26.2, 26.3, 26.5 },
				{ 19.5, 19.8, 20.1, 23.5, 23.9, 24.3, 24.7, 25.1, 25.5, 26.8, 27.1, 28.4, 28.7, 29.0, 28.3, 28.6, 28.9,
						29.2, 28.5, 28.8, 28.1, 27.3, 27.5, 26.7 },
				{ 19.2, 19.5, 19.9, 20.3, 20.7, 21.1, 21.5, 21.9, 22.3, 22.7, 23.1, 23.4, 23.7, 24.0, 24.3, 24.6, 24.9,
						25.2, 25.5, 25.8, 26.1, 26.3, 26.5, 26.7 } };

		Scanner input = new Scanner(System.in);

		System.out.println("Entre com o dia da semana");
		String diaPorExtenso = input.next();
		int diaDaSemana = 0;

		if (diaPorExtenso.equals("domingo")) {
			diaDaSemana = 0;
		} else if (diaPorExtenso.equals("segunda")) {
			diaDaSemana = 1;
		} else if (diaPorExtenso.equals("terça")) {
			diaDaSemana = 2;
		} else if (diaPorExtenso.equals("quarta")) {
			diaDaSemana = 3;
		} else if (diaPorExtenso.equals("quinta")) {
			diaDaSemana = 4;
		} else if (diaPorExtenso.equals("sexta")) {
			diaDaSemana = 5;
		} else if (diaPorExtenso.equals("sábado")) {
			diaDaSemana = 6;
		}

		double somaTempDia = 0;
		for (int i = 0; i < matriz[diaDaSemana].length; i++) {
			somaTempDia += matriz[diaDaSemana][i];
		}

		double mediaDia = somaTempDia / matriz[diaDaSemana].length;

		System.out.println("A média de temperatura no " + diaPorExtenso + " foi de " + mediaDia);

		System.out.println("Qual hora você quer saber a média");
		int hora = input.nextInt();

		double somaTempHora = 0;
		for (int i = 0; i < matriz.length; i++) {
			somaTempHora += matriz[i][hora];
		}

		double mediaHora = somaTempHora / matriz.length;

		System.out.println("A média das " + hora + " horas foi de " + mediaHora);

		int diaMaiorAmplitude = 0;
		double maiorAmplitude = Integer.MIN_VALUE;

		for (int i = 0; i < matriz.length; i++) {
			double maiorTemperatura = Integer.MIN_VALUE;
			double menorTemperatura = Integer.MAX_VALUE;
			double amplitude = 0;
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] > maiorTemperatura) {
					maiorTemperatura = matriz[i][j];
				}
				if (matriz[i][j] < menorTemperatura) {
					menorTemperatura = matriz[i][j];
				}

			}
			amplitude = maiorTemperatura - menorTemperatura;
			if (amplitude > maiorAmplitude) {
				maiorAmplitude = amplitude;
				diaMaiorAmplitude = i;

			}
		}
		if (diaMaiorAmplitude == 0) {
			System.out.println("O dia com a maior amplitude foi domingo");

		} else if (diaMaiorAmplitude == 1) {
			System.out.println("O dia com a maior amplitude foi segunda");

		} else if (diaMaiorAmplitude == 2) {
			System.out.println("O dia com a maior amplitude foi terca");

		} else if (diaMaiorAmplitude == 3) {
			System.out.println("O dia com a maior amplitude foi quarta");

		} else if (diaMaiorAmplitude == 4) {
			System.out.println("O dia com a maior amplitude foi quinta");

		} else if (diaMaiorAmplitude == 5) {
			System.out.println("O dia com a maior amplitude foi sexta");

		} else {
			System.out.println("O dia com a maior amplitude foi sábado");

		}

	}

}
