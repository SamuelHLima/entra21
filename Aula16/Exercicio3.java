package Aula16;

public class Exercicio3 {

	public static void inforAluno(String nome,int idade){

		System.out.println("O nome do primeiro aluno é "+ nome);
		System.out.println("A idade do primeiro aluno é "+ idade);
		System.out.println("Ele(a) é aluno do entra 21\n");
		
	}
	
	public static void main(String[] args) {
		/*
		 * Faça um método para cada um dos seus seus colegas
O método deve printar:
O nome dele(a) é [nome]
Ele(a) tem [idade] anos
Ele(a) é estudante do Entra 21
(Em prints separados)

Os dados devem ser passados como parametros, e o metodo pode ser chamado mais de uma vez
		 */
inforAluno("Rodrigo", 28);
inforAluno("Jonathan", 23);
inforAluno( "Bruna",24);
inforAluno("Vinicios", 18);
		
	}

}
