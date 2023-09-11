package Aula8;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		  Scanner entrada =new Scanner(System.in);
		/*
		 * . Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário,
		 *  mostrando uma mensagem de erro e voltando a pedir as informações, 
		 *  caso seja certo, de os parabéns e encerre o programa.
		 */
		 String nome, senha;
	      
	        
	        System.out.println("Informe o nome: ");
	        nome= entrada.next();

	        System.out.println("Informe a senha: ");
	        senha=entrada.next();

	        while (nome.equals(senha)) {
	            System.out.println("Erro: O nome de usuário e senha devem ser diferentes");
	            System.out.println("Informe o nome: ");
	        nome= entrada.next();

	        System.out.println("Informe a senha: ");
	        senha=entrada.next();
	            
	        }
	        System.out.println("Parabens programa encerrado! ");
	        entrada.close();

	    }
	
	}


