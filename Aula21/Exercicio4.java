package Aula21;

import java.util.ArrayList;
import java.util.List;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * Faça um algoritmo que atribua valores à Array List de acordo com o quadrado do seu índice
Ex:
[0] = 0
[1] = 1
[2] = 4
[3] = 9
[4] = 16;
		 */
		List<Integer> Lista = new ArrayList<>();

		for (int i = 0; i < 7; i++) {
			Lista.add(i*i);
			
		}
		for (int i = 0; i < Lista.size(); i++) {
            System.out.println("[" + i + "] = " + Lista.get(i));
		
	}

}
}
