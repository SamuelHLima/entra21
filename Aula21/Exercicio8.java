package Aula21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
	
		/*
		 * Faça um algoritmo que descubra 
		 * se uma Array List possui o número que o usuário entrou.
Imprima também o seu índice
		 */
		
		ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        System.out.print("Digite um número a ser procurado: ");
        int numeroProcurado = entrada.nextInt();

        
        int indice = -1; 
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) == numeroProcurado) {
                indice = i;  
                break;      
            }
        }

      
        if (indice != -1) {
            System.out.println("O número " + numeroProcurado + " foi encontrado no índice " + indice + ".");
        } else {
            System.out.println("O número " + numeroProcurado + " não foi encontrado na lista.");
        }

}
}