package Aula19;

public class Exercicio3 {
	public static int perimetro(int altura,int base) {
		return altura+altura+base+base;
	}
	public static int area(int altura,int base) {
		return altura*base;
	}

	public static void main(String[] args) {
		/*
		 * Faça um programa que calcule o perímetro e a área de um retângulo.

Retornar os valores calculados(Separem em duas funções,
 sendo que cada um deve retornar somente o numero(sem mensagem)
		 */
System.out.println(perimetro(10, 10));
System.out.println(area(10, 10));
	}

}
