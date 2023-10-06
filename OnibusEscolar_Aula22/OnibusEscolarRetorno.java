package OnibusEscolar_Aula22;

import java.util.Scanner;

public class OnibusEscolarRetorno {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// TODO Auto-generated method stub

		
		OnibusEscolar onibus1= new OnibusEscolar(22,10 );
		
		System.out.println("Qual a quantidade de alunos voce deseja remover do onibus?");
		int remover=entrada.nextInt();
		
		onibus1.removerAlunos(remover);
		
		
		System.out.println(onibus1.toString());
	}

}
