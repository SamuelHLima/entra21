package Aula8;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		/*
		 * 1. Faça uma calculadora. O usuário entra com dois números e depois com a operação desejada.  

Caso o número da operação seja 1: some os dois números.  

Caso seja 2: subtraia os dois números.  

Caso seja 3: multiplique os dois números.  

Caso seja 4: divida os dois números. 

Após realizada a operação, solicite ao usuário se deseja continuar realizando operações
 (sempre com dois novos valores) digite qualquer tecla e caso queira encerrar informe a letra ‘n’.
		 */

		
	double numero1,numero2;
	int opcao;
	char continuar;
	do {
	System.out.println("Informe o primeiro numero ");
    numero1= entrada.nextDouble();
    
    System.out.println("Informe o segundo numero ");
    numero2= entrada.nextDouble();
    
    System.out.println("Escolha a operação:");
    System.out.println("1 - Soma");
    System.out.println("2 - Subtração");
    System.out.println("3 - Multiplicação");
    System.out.println("4 - Divisão");
    opcao= entrada.nextInt();
   
        
    switch (opcao) {
	case 1:
		System.out.println("A soma dos valores é  " + (numero1 + numero2));
		break;
	case 2:
		System.out.println("A subtração dos valores é  " + (numero1 - numero2));
		break;
	case 3:
		System.out.println("A multiplicação dos valores é  " + (numero1 * numero2));
		break;
	case 4:
		System.out.println("A divisão dos valores é  " + (numero1 / numero2));
		break;

	default:
		System.out.println("Opção invalida, favor digitar entre os valores 1 a 4 ");
		
	}
    System.out.print("Deseja continuar? (Digite 'n' para encerrar): ");
    continuar = entrada.next().charAt(0);
	
	
	}while (continuar != 'n');
	System.out.println("Calculadora encerrada.");
}
	
}