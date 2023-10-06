package Retangulo_Aula22;

import java.io.ObjectInputStream.GetField;

public class Retnagulo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double maiorPerimetro=Integer.MIN_VALUE;
		double maiorArea=Integer.MIN_VALUE;
		
		Retangulo r1= new Retangulo (10 , 20);
		Retangulo r2= new Retangulo (20 , 30);
		Retangulo r3= new Retangulo (40 , 40);
		Retangulo r4= new Retangulo (20 , 30);
		Retangulo maiorPerimetro1 = null;
		Retangulo maiorArea1=null;
		
		for (Retangulo r : Retangulo.retangulo) {
			
			if (r.area()>maiorArea) {
				maiorArea=r.area();
				maiorArea1=r;
			} 
			if (r.perimetro()>maiorPerimetro) {
				maiorPerimetro = r.perimetro();
				maiorPerimetro1 = r;
			}

			}System.out.println(maiorArea1.toString());
			System.out.println(maiorPerimetro1.toString());
		}
		
	}

