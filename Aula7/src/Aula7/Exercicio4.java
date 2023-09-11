package Aula7;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		 Scanner teclado= new Scanner(System.in);
		/*
		 * Descreva um algoritmo que vá lendo a altura de pessoas até o usuário entrar com o número 0 

Calcule a média de altura das mesmas.
		 */
		   
	       
System.out.println("pedindo a altura");
double altura =teclado.nextDouble();

//auxiliares
double soma=0;
int quantasPessoas=0;//contador
while(altura != 0) {
	soma +=altura;
	quantasPessoas++;
	System.out.println("pedindo a altura");
	altura =teclado.nextDouble();
	
}
double media = soma/quantasPessoas;
System.out.println("A média é "+ media);
	}
}
	        

	        /*while (numero != 0) {
	            System.out.println("Informe sua altura em centimetros ");
	        numero = teclado.nextInt();
	        soma +=numero;
	        i++;       	       
	          
	            
	        }
	        media = soma/i;
	        System.out.printf("a media das alturas são " + media);
	        
	        }
	        
	    }*/

	

	


