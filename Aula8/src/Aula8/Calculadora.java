package Aula8;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);
		        char continueChoice;

		        do {
		            System.out.print("Digite o primeiro número: ");
		            double num1 = scanner.nextDouble();

		            System.out.print("Digite o segundo número: ");
		            double num2 = scanner.nextDouble();

		            System.out.println("Escolha a operação:");
		            System.out.println("1 - Soma");
		            System.out.println("2 - Subtração");
		            System.out.println("3 - Multiplicação");
		            System.out.println("4 - Divisão");
		            int operation = scanner.nextInt();

		            double result = 0;

		            switch (operation) {
		                case 1:
		                    result = num1 + num2;
		                    break;
		                case 2:
		                    result = num1 - num2;
		                    break;
		                case 3:
		                    result = num1 * num2;
		                    break;
		                case 4:
		                    result = num1 / num2;
		                    break;
		                default:
		                    System.out.println("Operação inválida.");
		            }

		            System.out.println("Resultado: " + result);

		            System.out.print("Deseja continuar? (Digite 'n' para encerrar): ");
		            continueChoice = scanner.next().charAt(0);

		        } while (continueChoice != 'n');

		        System.out.println("Calculadora encerrada.");
		    }
		


	}


