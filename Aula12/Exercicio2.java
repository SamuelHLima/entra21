package Aula12;

public class Exercicio2 {

	public static void main(String[] args) {
		
		/*
		 *Criar uma matriz com 2 linha e 10 colunas, 
		 * Agora criem uma segunda linha e novamente somem todas as colunas, por fim somem os valores da linho 0 e da linha 1
		 */
int[][] matriz=new int[2][10];
		
		matriz[0][0]=1;
		matriz[0][1]=2;
		matriz[0][2]=3;
		matriz[0][3]=4;
		matriz[0][4]=5;
		matriz[0][5]=6;
		matriz[0][6]=7;
		matriz[0][7]=8;
		matriz[0][8]=9;
		matriz[0][9]=10;
		matriz[1][0]=11;
		matriz[1][1]=12;
		matriz[1][2]=13;
		matriz[1][3]=14;
		matriz[1][4]=15;
		matriz[1][5]=16;
		matriz[1][6]=17;
		matriz[1][7]=18;
		matriz[1][8]=19;
		matriz[1][9]=20;
		
		double soma=0;
		double media=0;
		int pares=0;
		int impar=0;
		
	for (int i = 0; i < matriz.length; i++) {
		
		for (int j = 0; j < matriz[i].length; j++) {
			soma+=matriz[i][j];	
			media=soma/matriz[i][j];
			System.out.println(matriz[i][j]);
	}
			
	}
	
	System.out.println(soma);
	System.out.println(media);
	

}
}


