package Aula11;

public class ExemploMatriz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
float [][] matriz = new float[3][2];
		
		matriz[0][0]=(float) 1.65;
		matriz[0][1]=94;
		matriz[1][0]=(float)1.80;
		matriz[1][1]=7;
		matriz[2][0]=(float)1.81;
		matriz[2][1]=73;
		
		double media=(matriz[0][0]+matriz[1][0]+matriz[2][0])/3;
		System.out.println(media);
		
	}

}
