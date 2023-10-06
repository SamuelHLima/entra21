package aula18;

public class Circulo1 {

	public static void main(String[] args) {
		/*
		 * Crie uma classe chamada Circulo que tenha o atributo raio

Calcule a área de 5 objetos diferentes de Circulo

Para obter o valor de PI, use a função Math.PI do Java
		 */
		
		Circulo c1=new Circulo();
		c1.raio=4;
		System.out.println(c1.calcularArea());
		
		Circulo c2=new Circulo();
		c2.raio=5;
		System.out.println(c2.calcularArea());

		Circulo c3=new Circulo();
		c3.raio=3;
		System.out.println(c3.calcularArea());
		
		Circulo c4=new Circulo();
		c4.raio=44;
		System.out.println(c4.calcularArea());
		
		Circulo c5=new Circulo();
		c5.raio=9;
		System.out.println(c5.calcularArea());
	}

}
