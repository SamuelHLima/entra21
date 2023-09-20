package Aula11;

public class ExemploMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] matriz = new String[3][2];
		
		matriz[0][0]="Doritos";
		matriz[0][1]="3";
		matriz[1][0]="Chocolate";
		matriz[1][1]="9";
		matriz[2][0]="Sushi";
		matriz[2][1]="7";
		
		System.out.println("comida " + matriz[1][0]+" Quantidade de votos " + matriz[1][1]);
		System.out.println("comida " + matriz[2][0]+" Quantidade de votos " + matriz[2][1]);
	}

}
