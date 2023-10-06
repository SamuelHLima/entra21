package Cidades_Principal;

public class Cidade {
	/*
	 * O código a seguir foi escrito por um programador descuidado que, após tê-lo
	 * escrito, perdeu o código original da classe Cidade. Verifique o trecho de
	 * código abaixo, e escreva qual seria o código necessário da classe.
	 * 
	 * 
	 * Cidade gaspar = new Cidade(); gaspar.nome( "Gaspar" ); gaspar.uf( "SC" );
	 * gaspar.populacaoMasculina( 28141 );
	 * 
	 * Cidade indaial = new Cidade(); indaial.nome( "Indaial" );
	 * indaial.populacaoFeminina( 25844 ); indaial.calculado( true );
	 */

	private String nome;
	private String uf;
	private int populaçãoMasculina;
	private int populaçãoFeminina;
	private boolean calculado;
	public Cidade(String nome, String uf, int populaçãoMasculina, int populaçãoFeminina, boolean calculado) {
		
		setNome ( nome);
		setUf (uf);
		setPopulaçãoMasculina ( populaçãoMasculina);
		setPopulaçãoFeminina  (populaçãoFeminina);
		setCalculado ( calculado);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public int getPopulaçãoMasculina() {
		return populaçãoMasculina;
	}
	public void setPopulaçãoMasculina(int populaçãoMasculina) {
		this.populaçãoMasculina = populaçãoMasculina;
	}
	public int getPopulaçãoFeminina() {
		return populaçãoFeminina;
	}
	public void setPopulaçãoFeminina(int populaçãoFeminina) {
		this.populaçãoFeminina = populaçãoFeminina;
	}
	public boolean isCalculado() {
		return calculado;
	}
	public void setCalculado(boolean calculado) {
		this.calculado = calculado;
	}
	
	

}
