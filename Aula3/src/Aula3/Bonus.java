package Aula3;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		float nota1,nota2,nota3, media;
    	int frequencia;
		
		System.out.println("Informe a primeira nota do aluno entre 1 a 10");
		nota1 = entrada.nextFloat();
		System.out.println("Informe a segunda nota do aluno entre 1 a 10");
		nota2 = entrada.nextFloat();
		System.out.println("Informe a terceira nota do aluno entre 1 a 10");
		nota3 = entrada.nextFloat();
		System.out.println("Informe a frequencia do aluno");
		frequencia = entrada.nextInt();
		
		media = (nota1+nota2+nota3)/3;
		
		if (media <7 || frequencia < 75) {
			System.out.println("Reprovado");
		} else if ( media >= 10  )  {
			System.out.println(" Aprovado com distinção");
		}else if (media >=7){
			System.out.println("aprovado");
		}

	}

}
