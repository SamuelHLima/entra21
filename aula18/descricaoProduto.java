package aula18;

public class descricaoProduto {

	public static void main(String[] args) {
		/*
		 * A partir das representações abaixo dos objetos de uma classe Produto. Escreva
		 * o código necessário para suportar tais objetos. Ou seja, o código necessário
		 * para criar a classe e instanciar os objetos de modo que fiquem com o estado
		 * apresentado.
		 * 
		 * produto1: Produto nome = “Caderno” descricao = “Caderno em espiral tamanho
		 * médio” precoUnitario = 4,50 desconto = 15
		 * 
		 * 
		 * produto2: Produto nome = “Caneta ESF” descricao = “Caneta esferográfica 5mm”
		 * precoUnitario = 1,20 desconto = 2
		 * 
		 * 
		 * produto3: Produto nome = “Esquadro” descricao = “Esquadro de acrílico 20 cm”
		 * precoUnitario = 2,35 desconto = 10
		 * 
		 */

		Produto produto1 = new Produto();

		produto1.nome = "Caderno";
		produto1.Descricao = "Caderno em espiral tamanho médio";
		produto1.precoUnitario = 4.50;
		produto1.desconto = 15;

		Produto produto2 = new Produto();

		produto2.nome = "Caneta ESF";
		produto2.Descricao = "Caneta esferográfica 5mm";
		produto2.precoUnitario = 1.20;
		produto2.desconto = 2;

		Produto produto3 = new Produto();

		produto3.nome = "Esquadro";
		produto3.Descricao = "Esquadro de acrílico 20cm";
		produto3.precoUnitario = 2.35;
		produto3.desconto = 10;

	}

}
