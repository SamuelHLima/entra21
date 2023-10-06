package aula18;

public class Mercado {
	/*
	 * Crie uma classe denominada Mercado.
	 * 
	 * Essa classe terá 4 atributos, as informações que deverão ser guardadas são:
	 * Número de maçãs vendidas por ano. Preço de venda das maçãs. Número de
	 * laranjas vendidas por ano. Preço de venda das laranjas.
	 * 
	 * Crie 3 objetos da classe Mercado chamados:
	 * 
	 * unidadeDeBlumenau unidadeDeJoinville unidadeDeFlorianopolis
	 */
	int NumeroMacaVendidas;
	double precoMaca;
	int NumeroLaranjasVendidas;
	double precoLaranja;

	
	
	public Mercado(int numeroMacaVendidas, double precoMaca, int numeroLaranjasVendidas, double precoLaranja) {
		
		NumeroMacaVendidas = numeroMacaVendidas;
		this.precoMaca = precoMaca;
		NumeroLaranjasVendidas = numeroLaranjasVendidas;
		this.precoLaranja = precoLaranja;
	}

	public double lucroMacas()

	{
		return NumeroMacaVendidas * precoMaca;
	}

	public double lucroLaranja() {
		return NumeroLaranjasVendidas * precoLaranja;
	}

	public double lucroTotal() {
		return lucroMacas() + lucroLaranja();
	}

}
