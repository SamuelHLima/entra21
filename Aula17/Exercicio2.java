package Aula17;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void starWars(String nome,String sobrenome,String mae,String cidade) {
		System.out.println("Seu nome é \n"+sobrenome.charAt(0)+sobrenome.charAt(1)+sobrenome.charAt(2)+nome.charAt(0)+nome.charAt(1)+" "+mae.charAt(0)
		+mae.charAt(1)+cidade.charAt(2)+cidade.charAt(0)+cidade.charAt(1));

		
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		/*
		 * George Lucas utiliza  uma  fórmula  para  criar
		 *   os  nomes dos  personagens  em  suas  
		 *   histórias  (Jar  Jar  Binks, ObiWan Kenobi, etc).
A fórmula, supostamente, é:

Seu primeiro nome na série Star Wars:
i.Pegue as três primeiras letras de seu sobrenome
ii.Adicione a ele as duas primeiras letras de seu nome

Seu sobrenome na série Star Wars:
i.Pegue as duas primeiras letras do sobrenome de solteira de sua mãe
ii.Adicione a ele as três primeiras letras do nome da 
cidade onde você nasceu


Crie um  método chamado generateStarWarsName que 
 gera  um  nome  completo  Star  Wars  conforme  descrito.
Printe o seu nome Star Wars

As entradas serão os nomes completos.
		 */

		System.out.println("Informe o seu primeiro nome somente");
		String nome=entrada.next();
		System.out.println("Informe o seu sobrenome paterno");
		String sobrenome=entrada.next();
		System.out.println("Informe o sobrenome de solteira da sua mãe");
		String mae=entrada.next();
		System.out.println("Informe a cidade que voce nasceu");
		String cidade=entrada.next();
		
		starWars(nome, sobrenome, mae, cidade);
	}

}
