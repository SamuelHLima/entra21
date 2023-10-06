package Retangulo_Aula22;

import java.util.ArrayList;
import java.util.List;

public class Retangulo {
/*
 * Faça uma classe chamada Retangulo, 
 * com os atributos altura e largura.
Faça um método para descobrir a área e 
outro para descobrir o perímetro.
Crie 10 objetos de Retangulo.

Imprima o toString do retângulo com a maior 
área e o toString do retângulo com o maior perímetro
 */

	private double largura;
	private double altura;
	public static List<Retangulo> retangulo = new ArrayList<>();
	public Retangulo(double largura, double altura) {
		
		setLargura (largura);
		setAltura (altura);
		retangulo.add(this);
	}
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		if (largura<0) {
			System.out.println("Valor negativo invalido");
		}else{
			this.largura = largura;
		}
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		if (altura<0) {
			System.out.println("Valor negativo invalido para altura");
		}else{
			this.altura = altura;
		}
	}
	public static List<Retangulo> getRetangulo() {
		return retangulo;
	}
	public static void setRetangulo(List<Retangulo> retangulo) {
		Retangulo.retangulo = retangulo;
	}
	public double area() {
		return this.getAltura()*this.getLargura();
	}
	public double perimetro() {
		return 2*(this.getAltura()+this.getLargura());
	}
	@Override
	public String toString() {
		return "A Largura "+ this.getLargura()+" a altura "+this.getAltura()+" A area "+this.area()+" o perimetro "+this.perimetro();
	}
	
}
