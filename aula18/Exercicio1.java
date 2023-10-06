package aula18;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * Em uma classe denominada Pessoa, deseja-se manter o nome, sexo, data de
		 * nascimento e estado civil de uma pessoa. O sexo deve ser definido como um
		 * caracter. A data deve ser definida como String.
		 * 
		 * Crie 2 objetos de Pessoa
		 */
		pessoa Tadeu = new pessoa();

		Tadeu.nome = "tadeu";
		Tadeu.sexo = 'm';
		Tadeu.dataDeNascimento = "19/12/1758";
		Tadeu.estadoCivil = "Casado";

		pessoa Jessica = new pessoa();

		Jessica.nome = "Jessica";
		Jessica.sexo = 'f';
		Jessica.dataDeNascimento = "01/01/1992";
		Jessica.estadoCivil = "Casada";

		System.out.println(Jessica.nome);
	}

}
