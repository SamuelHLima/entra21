package Aula21;

import java.util.ArrayList;
import java.util.List;

public class TesteArray {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();

		lista.add("Sergio");
		lista.add("Bruna");
		lista.add("Aline");
		lista.add(1, "Claudio");
		lista.remove("Sergio");
		lista.remove(1);

		System.out.println(lista);
	}

}
