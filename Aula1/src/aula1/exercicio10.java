package aula1;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		/*
		 * . Dois carros (X e Y) partem em uma mesma direção.
O carro X sai com velocidade constante de 60 Km/h e o carro Y sai com
velocidade constante de 90 Km/h.
Em uma hora o carro Y consegue se distanciar 30 quilômetros do carro
X, ou seja, consegue se afastar um quilômetro a cada 2 minutos.
Leia a distância (em Km) e calcule quanto tempo leva (em minutos) para
o carro Y tomar essa distância do outro carro.  
		 */
		Scanner entrada = new Scanner(System.in);
		double tempo, km;

		System.out.println("Digite a distancia em quilometros entre os carros");
		km = entrada.nextDouble();
		
		
		tempo = km * 2;

		System.out.printf("O tempo em minutos que leva para o carro y se dinstanciar do carro x é %.2f\n", tempo);
		
		

	}

}
