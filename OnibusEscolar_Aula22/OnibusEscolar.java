package OnibusEscolar_Aula22;

import java.util.ArrayList;
import java.util.List;

public class OnibusEscolar {
	/*
	 * 3-Faça uma classe chamada OnibusEscolar, com os atributos estudantes e
	 * professor
	 * 
	 * Faça uma exceção no método setAlunos que se o número de alunos for maior do
	 * que 40, faça com que o número de alunos seja 40
	 * 
	 * Caso o número de professores for 0, o número de alunos também deve ser zerado
	 * 
	 * Faça também um método chamado remover alunos, que deverá remover os alunos de
	 * acordo com o valor passado como parâmetro
	 * 
	 */

	private int estudantes;
	private int professores;
	public static List<OnibusEscolar> listaOnibus = new ArrayList<>();

	public OnibusEscolar(int estudantes, int professores) {

		setEstudantes(estudantes);
		setProfessores(professores);
		listaOnibus.add(this);
	}

	public int getEstudantes() {
		return estudantes;
	}

	public void setEstudantes(int estudantes) {
		if (estudantes < 0) {
			System.out.println("Valor invalido");
		} else if (estudantes > 40) {
			this.estudantes = 40;
		} else {
			this.estudantes = estudantes;
		}
	}

	public int getProfessores() {
		return professores;
	}

	public void setProfessores(int professores) {
		if (professores == 0) {
			this.estudantes = 0;
		} else {
			this.professores = professores;
		}
	}

	public void removerAlunos(int remover) {
		setEstudantes(this.estudantes - remover);
	}

	@Override
	public String toString() {
		return "O onibus tinha " + this.getEstudantes() + " estudantes e " + this.getProfessores() + " Professor";
	}
}
