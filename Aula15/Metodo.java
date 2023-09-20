package Aula15;

public class Metodo {

	public static void myName() {
		/*
		 * Crie um metodo para imprimir seu nome,sua idade e a cor favorita
		 */
		System.out.println("Meu nome é Samuel");
		System.out.println("Minha idade é 33 anos");
		System.out.println("Minha cor favorita é preto");
	}
	public static void altura() {
		/*
		 * Crie mais um metodo, utilize os dados de altura de dois amigos
		 * e imprima a media e os nomes
		 */
		double Rodrigo =1.65;
		double Jonathan=1.87;
		double media = 0;
		
	media=(Rodrigo*Jonathan)/2;
	System.out.println("A media da altura dos amigos é "+ media+" o nome do primeiro amigo é "+Rodrigo+"o nome do segundo amigo é: "+Jonathan);
		
	}
	
	public static void soma() {
		//utilize o metodo conta(), ja criado, querbre o mesmo em dois metodos-
		//soma() e multiplicação(), sendo que os nomes das variaveis deve ser iguais
		int valor=10;
		int valor1=100;
		int soma=0;
		
		
		System.out.println("A soma dos valores é : "+(valor+valor1));
	}
	public static void calculo() {
		/*
		 * Crie um metodo com duas variaveis com os valores 10 e 100, imprima a multiplica
		 * e soma
		 */
	int valor=10;
	int valor1=100;
	int multipli=0;
	
	
	System.out.println("A multiplicação dos valores é "+(valor*valor1));
	
		
	
	}
public static void main(String[]args) {
	//para chamar um metodo:vou escrever o nome dele, sem esquecer dos parenteses.
	myName();
	calculo();
	soma();
	altura();
	
}
}
