package exercicios.exercicio10;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		ArrayList<String> animals = new ArrayList<String>();
		int dogs = 0;
		int cats = 0;
		int bat = 0;

		System.out.println("|-------------------------------|\n" + "| Catálogo de Mamíferos         |\n"
				+ "|-------------------------------|\n" + "|  1: Listar catálogo           |\n"
				+ "|  2: Contabilizar catálogo     |\n" + "|  3: Adicionar Cachorro        |\n"
				+ "|  4: Adicionar Gato            |\n" + "|  5: Adicionar Morcego         |\n"
				+ "|  0: Sair                      |\n" + "|-------------------------------|");

		int input = -1;

		while (input != 0) {
			System.out.print("Sua Escolha: ");
			input = keyboard.nextInt();

			switch (input) {
			case 1:
				for (int i = 0; i < animals.size(); i++) {
					System.out.printf("[%d] - Eu sou um %s%n", i+1, animals.get(i));
				}
				break;
			case 2:
				System.out.println("O catalogo possui: ");
				System.out.printf("%d Cachorros\n", dogs);
				System.out.printf("%d Gatos\n", cats);
				System.out.printf("%d Morcegos\n", bat);
				break;
			case 3:
				System.out.println("Cachorro adicionado");
				animals.add("Cachorro");
				dogs++;
				break;
			case 4:
				System.out.println("Gato adicionado");
				animals.add("Gato");
				cats++;
				break;
			case 5:
				System.out.println("Morcego adicionado");
				animals.add("Morcego");
				bat++;
				break;
			case 0:
				System.out.println("Encerrando programa...");
				System.exit(0);
				break;
			default:
				break;
			}

		}
		keyboard.close();

	}

}
