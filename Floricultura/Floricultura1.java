package Floricultura;



public class Floricultura1 {

	public static void main(String[] args) {
		/*
		 * Em um sistema de uma floricultura deve se 
		 * guardar o nome da flor, o preço, nome do 
		 * cliente que comprou a flor e se a flor é para presente ou não.

Crie 5 objetos de flor e as coloque em uma Array List

Responda:
a) Quem comprou a flor mais cara?
b) Qual o nome da flor mais cara?

		 */
		
		double florMaisCara=Integer.MIN_VALUE;
		
		floricultura flor1= new floricultura("Margarida", 15 , "Joao", false);
		floricultura flor2= new floricultura("Flor do deserto", 25 , "tai", true);
		floricultura flor3= new floricultura("orquidea", 45 , "Vivi", false);
		floricultura maiorFlor=null;
		
		
		for (floricultura f : floricultura.listaFlor) {
			if (f.getPreco() >florMaisCara) {
				florMaisCara=f.getPreco();
				maiorFlor=f;
			}
		}
		System.out.println(maiorFlor.toString());
		
		
		
		
	}

}
