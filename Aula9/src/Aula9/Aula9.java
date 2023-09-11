package Aula9;

import java.util.Scanner;

public class Aula9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// TODO Auto-generated method stub
		int soma=0;
		int[] idades = new int[5];
		idades[0] = 18;
		idades[1] = 24;
		idades[2] = 22;
		idades[3] = 28;
		idades[4] = 18 ;
		System.out.println(idades[4]);
		int idade = idades[0]+idades[1]+idades[2]+idades[3]+idades[4];
		System.out.println("Soma "+idade);
		System.out.println("Media " +(idade/5));
		
		for (int i = 0; i < 5; i++) {
			soma =soma + idades[i];
					
		}	System.out.println("Soma " +soma);
	
	
	String[] nomes = new String[4];
	nomes[0]="Ana";
	nomes[1]="Arthur";
	nomes[2]="Beatriz";
	nomes[3]="Bruna";
	
	for (int  z = 0;  z < nomes.length; z++) {
		System.out.println(nomes[z]);
	}
	
	String[] exemplo=new String[21];
	for (int w = 0; w < exemplo.length; w++) {
		exemplo[w]=entrada.next();
		
	}for (int w = 0; w < exemplo.length; w++) {
		System.out.println(exemplo[w]);
	}
	
}
}


