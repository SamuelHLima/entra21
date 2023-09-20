package Aula16;

public class Exercicio4 {

	public static void soma(int valor, int valor1,int valor2,int valor3) {
		/*
		 * Faça um programa que some 4 números.
Passando esses 4 números como parâmetros para um método
		 */
		int soma=0;
		
		
		System.out.println("A soma dos valores é : "+(valor+valor1+valor2+valor3));
	}

	public static void main(String[] args) {
		/*
		 * Reutilizar metodo soma, porem passar os dados via parametro
		 */
		soma(10, 100, 15, -45);
	}

}
