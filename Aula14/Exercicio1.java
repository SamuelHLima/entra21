package Aula14;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		/*
		 * O índice de massa corporal (IMC) é uma medida internacional usada para
		 * calcular se um pessoa está no peso ideal. O IMC é determinado pela divisão da
		 * massa do indivíduo pelo quadrado de sua altura, onde a massa está em
		 * quilogramas e a altura está em metros, de acordo com a fórmula: IMC = Massa /
		 * Altura²
		 * 
		 * Faça um algoritmo para classificar o IMC e dizer o grau de obesidade do
		 * indivíduo, de acordo com a seguinte tabela:
		 * 
		 * < 18.5 Magreza
		 * 
		 * 18.5 – 24.9 Saudável
		 * 
		 * 25.0 – 29.9 Sobrepeso
		 * 
		 * 30.0 – 34.9 Obesidade Grau I
		 * 
		 * 35.0 – 39.9 Obesidade Grau II (severa)
		 * 
		 * > 40.0 Obesidade Grau III (morbida)
		 * 
		 */

		System.out.println("Informe a sua altura  ");
		double altura = entrada.nextDouble();

		System.out.println("Informe o seu peso ");
		double peso = entrada.nextDouble();
1
		double imc = 0;
		imc = peso / Math.pow(altura, 2);

		if (imc < 18.5) {
			System.out.println("Magreza");
		} else if (imc >= 18.5 && imc <= 24.9) {
			System.out.println("saudável");
		} else if (imc >= 25 && imc <= 29.9) {
			System.out.println("Sobrepeso");
		} else if (imc >= 30 && imc <= 34.9) {
			System.out.println("Obesidade Grau I");
		} else if (imc >= 35 && imc <= 39.9) {
			System.out.println("Obesidade Grau II(Severa)");
		} else if (imc > 40) {
			System.out.println("Obesidade Grau II(Severa)");
		}

	}

}
