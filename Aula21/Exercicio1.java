package Aula21;

import java.util.ArrayList;
import java.util.List;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * Coloque 5 elementos em uma Array List e ordene-os
		 */
		
		
		List<String> Lista = new ArrayList<>();
		Lista.add("Tadeu");
		Lista.add("Joana");
		Lista.add("Aline");
		Lista.add("Jessica");
		Lista.add("Samuel");
		Lista.sort(null);
		
		System.out.println(Lista);
	}

}
