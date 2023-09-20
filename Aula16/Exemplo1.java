package Aula16;

public class Exemplo1 {

	public static void metodoComParametro(String nome) {
		System.out.println("Meu nome: "+nome);
	}
	
	public static void metodoComMaisDeUmParametro(int idadeUm,int idadeDois, String texto) {
		System.out.println("a soma das idades : "+(idadeUm+idadeDois));
		System.out.println("e o texto: "+texto);
	}
	public static void main(String[] args) {
		//metodoComParametro("maria");
		//String nome="tadeu";
		//metodoComParametro(nome);
		metodoComMaisDeUmParametro(15, 20, "oi");
	}

}
