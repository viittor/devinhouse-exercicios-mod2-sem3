package exercicios.exercicio05;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
	Scanner entrada = new Scanner(System.in);
	ArrayList<Pessoa> listaPessoa = new ArrayList<>();
	int contador = 0;

	public void armazenaPessoa(String nome, int idade, float altura) {
		if (contador > 10) {
			System.out.println("Você atingiu o máximo de 10 pessoas!");
		} else {
			listaPessoa.add(new Pessoa(nome, idade, altura));
			contador++;
		}
	}

	public int buscaPessoa(String nome) {
		System.out.println("Digite o nome da pessoa que deseja procurar: ");
		nome = entrada.nextLine();
		int posicao = 0;

		for (int i = 0; i <= listaPessoa.size(); i++) {
			if (listaPessoa.contains(nome)) {
				System.out.println("oi");
				posicao = i;
			}
		}
		return posicao;
	}

	void imprimePessoa(int index) {
		System.out.println("Digite a posição da agenda: ");
		index = entrada.nextInt();

		for (int i = 0; i <= listaPessoa.size(); i++) {
			if (index == i) {
				System.out.println(listaPessoa.get(i));
			}
		}
	}

	void imprimeAgenda() {
		System.out.println(listaPessoa);
	}

	void removePessoa(String nome) {
		System.out.println("Digite o nome da pessoa que deseja remover: ");
		nome = entrada.nextLine();
		
		for (int i = 0; i <= listaPessoa.size(); i++) {
			if (listaPessoa.contains(nome)) {
				listaPessoa.remove(i);
				break;
			}
	}

}
}
