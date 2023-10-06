package Aula17;

import java.util.Scanner;

public class Revisao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		/*
		 *  Um cinema pretende fazer uma pesquisa para 
		 *  avaliar o grau de satisfação de seus clientes. 
		 *  Trinta deles foram ouvidos e para cada um
		 *   perguntou-se o sexo (1=feminino 2=masculino), 
		 *   uma nota para o cinema (zero até dez, valor inteiro) e a idade. 

Baseado nisto faça um programa que informe: 

qual a nota média recebida pelo cinema; 

qual a nota média atribuída pelos homens; 

qual a nota atribuída pela mulher mais jovem; 

quantas das mulheres com mais de 50 anos deram nota superior a média recebida pelo cinema.
		 */

		        
		        
		        int totalClientes = 5;
		        int somaNotas = 0;
		        int somaNotasHomens = 0;
		        int notaMulherMaisJovem = Integer.MAX_VALUE;
		        int contadorMulheresAcima50 = 0;
		        
		        for (int i = 1; i <= totalClientes; i++) {
		            System.out.println("Cliente " + i);
		            
		            System.out.print("Informe o sexo (1 = feminino, 2 = masculino): ");
		            int sexo = entrada.nextInt();
		            
		            System.out.print("Informe a nota (de 0 a 10): ");
		            int nota = entrada.nextInt();
		            
		            System.out.print("Informe a idade: ");
		            int idade = entrada.nextInt();
		            
		            somaNotas += nota;
		            
		            if (sexo == 2) {
		                // Cliente masculino
		                somaNotasHomens += nota;
		            } else if (sexo == 1) {
		                // Cliente feminino
		                if (idade < notaMulherMaisJovem) {
		                    notaMulherMaisJovem = nota;
		                }
		                if (idade > 50 && nota > somaNotas / totalClientes) {
		                    contadorMulheresAcima50++;
		                }
		            }
		        }
		        
		        double mediaNotas = (double) somaNotas / totalClientes;
		        double mediaNotasHomens = (double) somaNotasHomens / (totalClientes / 2); // Considerando metade dos clientes como homens
		        
		        System.out.println("Nota média recebida pelo cinema: " + mediaNotas);
		        System.out.println("Nota média atribuída pelos homens: " + mediaNotasHomens);
		        System.out.println("Nota atribuída pela mulher mais jovem: " + notaMulherMaisJovem);
		        System.out.println("Mulheres com mais de 50 anos que deram nota superior à média: " + contadorMulheresAcima50);
		        
		        entrada.close();
		    }
		

			
		
	}


