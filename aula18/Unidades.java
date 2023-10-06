package aula18;

public class Unidades {

	public static void main(String[] args) {
		/*
		 * Utilizando a classe Mercado.
		 * 
		 * Atribua valores às variáveis da classe Mercado para cada um dos objetos de
		 * Mercado.
		 * 
		 * Sendo que o preço de compra dos produtos foi igual em todos os mercados.
		 * 
		 * Calcule: a) Quem teve o maior lucro vendendo maçãs? b) Quem teve o maior
		 * lucro vendendo laranjas? c) Qual das lojas teve o maior lucro nesse ano
		 * específico? d) Qual das lojas teve o menor lucro? e) Qual das lojas ficou no
		 * "meio" em termos de lucro? f) Juntando as 3 lojas, a franquia teve um lucro
		 * maior vendendo maçãs ou laranjas?
		 */

		Mercado unidadeDeBlumenau = new Mercado(20000, 4.25, 55000, 7.10);
		Mercado unidadeDeJoinville = new Mercado(56000, 5.05, 12740, 5.10);
		Mercado unidadeDeFlorianopolis = new Mercado(70500, 4.75, 45000, 3.15);
		double lucroTotalMaca = unidadeDeBlumenau.lucroMacas() + unidadeDeFlorianopolis.lucroMacas()
				+ unidadeDeJoinville.lucroMacas();
		double lucroTotalLaranja = unidadeDeBlumenau.lucroLaranja() + unidadeDeFlorianopolis.lucroLaranja()
				+ unidadeDeJoinville.lucroLaranja();
		double maior = Math.max(Math.max(unidadeDeBlumenau.lucroTotal(), unidadeDeFlorianopolis.lucroTotal()),
				unidadeDeJoinville.lucroTotal());
		double menor = Math.min(Math.min(unidadeDeBlumenau.lucroTotal(), unidadeDeFlorianopolis.lucroTotal()),
				unidadeDeJoinville.lucroTotal());
		double meio = unidadeDeJoinville.lucroTotal() + unidadeDeBlumenau.lucroTotal()
				+ unidadeDeFlorianopolis.lucroTotal() - maior - menor;

		if (unidadeDeBlumenau.lucroMacas() > unidadeDeFlorianopolis.lucroMacas()
				|| unidadeDeBlumenau.lucroMacas() > unidadeDeJoinville.lucroMacas()) {
			System.out.println(" A unidade de Blumenau obteve maior lucro vendendo maças\n");
		} else if (unidadeDeBlumenau.lucroMacas() < unidadeDeFlorianopolis.lucroMacas()
				|| unidadeDeFlorianopolis.lucroMacas() > unidadeDeJoinville.lucroMacas()) {
			System.out.println(" A unidade de Florianopolis obteve maior lucro vendendo maças\n");
		} else {
			System.out.println("A unidade de Joinville obteve o maior lucro vendendo maça\n");
		}

		if (unidadeDeBlumenau.lucroLaranja() > unidadeDeFlorianopolis.lucroLaranja()
				|| unidadeDeBlumenau.lucroLaranja() > unidadeDeJoinville.lucroLaranja()) {
			System.out.println(" A unidade de Blumenau obteve maior lucro vendendo Laranjas\n");
		} else if (unidadeDeBlumenau.lucroLaranja() < unidadeDeFlorianopolis.lucroLaranja()
				|| unidadeDeFlorianopolis.lucroLaranja() > unidadeDeJoinville.lucroLaranja()) {
			System.out.println(" A unidade de Florianopolis obteve maior lucro vendendo Laranjas\n");
		} else {
			System.out.println("A unidade de Joinville obteve o maior lucro vendendo Laranjas\n");
		}
		
		if (maior==unidadeDeBlumenau.lucroTotal()) {
			System.out.println("O maior lucro foi da unidade de Blumenau com o valor de "+maior+"\n");
		}else if (maior==unidadeDeFlorianopolis.lucroTotal()) {
			System.out.println("O maior lucro foi da unidade de Florianopolis com o valor de "+maior+"\n");
		}else {
			System.out.println("O maior lucro foi da unidade de Joinville com o valor de "+maior+"\n");
		}
		
		if (menor==unidadeDeBlumenau.lucroTotal()) {
			System.out.println("O menor lucro foi da unidade de Blumenau com o valor de "+menor+"\n");
		}else if (menor==unidadeDeFlorianopolis.lucroTotal()) {
			System.out.println("O menor lucro foi da unidade de Florianopolis com o valor de "+menor+"\n");
		}else {
			System.out.println("O menor lucro foi da unidade de Joinville com o valor de "+menor+"\n");
		}
		
		if (meio==unidadeDeBlumenau.lucroTotal()) {
			System.out.println("O lucro mediano foi da unidade de Blumenau com o valor de "+meio+"\n");
		}else if (meio==unidadeDeFlorianopolis.lucroTotal()) {
			System.out.println("O lucro mediano foi da unidade de Florianopolis com o valor de "+meio+"\n");
		}else {
			System.out.println("O lucro mediano foi da unidade de Joinville com o valor de "+meio+"\n");
		}
		
		
		//System.out.println(unidadeDeBlumenau.lucroTotal());
		//System.out.println(unidadeDeFlorianopolis.lucroTotal());
		//System.out.println(unidadeDeJoinville.lucroTotal());

		if (lucroTotalLaranja > lucroTotalMaca) {
			System.out.println(
					"O maior lucro da franquia foi com a venda de laranjas com o valor de " + lucroTotalLaranja+"\n");
		} else {
			System.out.println("O maior lucro da franquia foi com a venda de Maças com o valor de " + lucroTotalMaca+"\n");
		}

	}
}
