package Aula16;

public class Exercicio1 {
	
	public static void soma(int valor, int valor1) {
		//utilize o metodo conta(), ja criado, querbre o mesmo em dois metodos-
		//soma() e multiplicação(), sendo que os nomes das variaveis deve ser iguais
		
		int soma=0;
		
		
		System.out.println("A soma dos valores é : "+(valor+valor1));
	}

	public static void main(String[] args) {
		/*
		 * Reutilizar metodo soma, porem passar os dados via parametro
		 */
		soma(10, 100);
	}

}
