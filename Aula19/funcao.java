package Aula19;

public class funcao {
	//Fórmula: public static TIPO NOME(){}
public static String imprimirNome() {
	//dentro do nosso escopo, a gente passa
	//a ter o retorno
	//sempre criem uma variavel
	String nome="Maju";
	return nome;
}

public static double soma(double numUm, double numDois) {
	//fiz o processo, ou melhor, a função
	double soma= numUm+numDois;
	return soma;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(imprimirNome());

System.out.println(soma(10.5,25.5));
	}

}
