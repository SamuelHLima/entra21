package Aula21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * Crie uma Array List e imprima os últimos elementos por primeiro
		 */

		List<String> Lista = new ArrayList<>();
		Lista.add("Tadeu");
		Lista.add("Joana");
		Lista.add("Aline");
		Lista.add("Jessica");
		Lista.add("Samuel");

		for (int i = Lista.size() - 1; i >= 0; i--) {
			System.out.println(Lista.get(i));

		}

	}

}
