package Aula17;
import java.util.Scanner;
public class revisao2 {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        int[][] dadosClientes = new int[30][3]; // Matriz para armazenar os dados (sexo, nota, idade)
		        
		        // Preencher a matriz com os dados dos clientes
		        for (int i = 0; i < 30; i++) {
		            System.out.println("Cliente " + (i + 1));
		            
		            System.out.print("Sexo (1=feminino, 2=masculino): ");
		            dadosClientes[i][0] = scanner.nextInt();
		            
		            System.out.print("Nota (0 a 10): ");
		            dadosClientes[i][1] = scanner.nextInt();
		            
		            System.out.print("Idade: ");
		            dadosClientes[i][2] = scanner.nextInt();
		        }
		        
		        // Calcular a nota média recebida pelo cinema
		        int somaNotas = 0;
		        for (int i = 0; i < 30; i++) {
		            somaNotas += dadosClientes[i][1];
		        }
		        double notaMediaCinema = (double) somaNotas / 30;
		        System.out.println("Nota média recebida pelo cinema: " + notaMediaCinema);
		        
		        // Calcular a nota média atribuída pelos homens
		        int somaNotasHomens = 0;
		        int totalHomens = 0;
		        for (int i = 0; i < 30; i++) {
		            if (dadosClientes[i][0] == 2) { // 2 representa masculino
		                somaNotasHomens += dadosClientes[i][1];
		                totalHomens++;
		            }
		        }
		        double notaMediaHomens = (double) somaNotasHomens / totalHomens;
		        System.out.println("Nota média atribuída pelos homens: " + notaMediaHomens);
		        
		        // Encontrar a nota atribuída pela mulher mais jovem
		        int idadeMulherMaisJovem = Integer.MAX_VALUE;
		        int notaMulherMaisJovem = 0;
		        for (int i = 0; i < 30; i++) {
		            if (dadosClientes[i][0] == 1 && dadosClientes[i][2] < idadeMulherMaisJovem) { // 1 representa feminino
		                idadeMulherMaisJovem = dadosClientes[i][2];
		                notaMulherMaisJovem = dadosClientes[i][1];
		            }
		        }
		        System.out.println("Nota atribuída pela mulher mais jovem: " + notaMulherMaisJovem);
		        
		        // Contar mulheres com mais de 50 anos que deram nota superior à média
		        int contadorMulheresMais50 = 0;
		        for (int i = 0; i < 30; i++) {
		            if (dadosClientes[i][0] == 1 && dadosClientes[i][2] > 50 && dadosClientes[i][1] > notaMediaCinema) {
		                contadorMulheresMais50++;
		            }
		        }
		        System.out.println("Mulheres com mais de 50 anos que deram nota superior à média: " + contadorMulheresMais50);
		        
		        scanner.close();
		    }
		

	}


