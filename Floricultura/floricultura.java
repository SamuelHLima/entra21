package Floricultura;

import java.util.ArrayList;
import java.util.List;

public class floricultura {
	/*
	 * Em um sistema de uma floricultura deve se 
	 * guardar o nome da flor, o preço, nome do 
	 * cliente que comprou a flor e se a flor é para presente ou não.

Crie 5 objetos de flor e as coloque em uma Array List

Responda:
a) Quem comprou a flor mais cara?
b) Qual o nome da flor mais cara?

	 */

	private String nomeFlor;
	private double preco;
	private String nomeCliente;
	private boolean presente;
	public static List<floricultura> listaFlor =new ArrayList<>();
	public floricultura(String nomeFlor, double preco, String nomeCliente, boolean presente) {
	
		setNomeFlor(nomeFlor);
		setPreco(preco);
		setNomeCliente(nomeCliente);
		setPresente(presente);
		listaFlor.add(this);
	}

	public String getNomeFlor() {
		return nomeFlor;
	}

	public void setNomeFlor(String nomeFlor) {
		this.nomeFlor = nomeFlor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco<0) {
			System.out.println("Valor invalido");
		}else {
		this.preco = preco;
	}
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public boolean isPresente() {
		return presente;
	}

	public void setPresente(boolean presente) {
		this.presente = presente;
	}
	@Override
	public String toString() {
		return "Quem comprou a flor mais cara foi " + nomeCliente +" O nome da flor é "+nomeFlor;
	}
	
	
}
