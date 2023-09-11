package aula6;
import java.util.Scanner;
public class Exercicio5 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		/*5. Ler um valor inteiro (aceitar somente valores entre 1 e 10) e escrever a tabuada de 1 a 10 do valor lido.
		 * 
		 */

		int numero;
        
        System.out.println("Informe um numero entre 1 e 10: ");
        numero = teclado.nextInt();
         
        
        for (int i =1; i<=10;i++) {
            System.out.printf("%d X %d = %d\n", numero, i, (numero * i));
        }
        teclado.close();
    }

		
	}


