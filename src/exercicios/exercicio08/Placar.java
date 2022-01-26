package exercicios.exercicio08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Placar {
	public static void main(String[] args) {

		TimeCasa casa = new TimeCasa();
		TimeVisitante visitante = new TimeVisitante();
		Scanner keyboard = new Scanner(System.in);

		System.out.println("|-------------------------------|\r\n" + "|Bem-vindos ao placar da rodada |\r\n"
				+ "|-------------------------------|\r\n" + "|  1: Iniciar novo jogo     	|\r\n"
				+ "|  2: Saber o placar atual  	|\r\n" + "|  3: + Ponto time da casa  	|\r\n"
				+ "|  4: - Ponto time da casa  	|\r\n" + "|  5: + Ponto time visitante	|\r\n"
				+ "|  6: - Ponto time visitante	|\r\n" + "|  0: Sair                  	|\r\n"
				+ "|-------------------------------|");

		int escolha = -1;
		while (escolha != 0) {
			try {
				System.out.print("Sua escolha: ");
				escolha = keyboard.nextInt();
				switch (escolha) {
				case 1: {
					System.out.println("\nNovo jogo inicializado!\n");
					break;
				}
				case 2: {
					System.out.printf("\nTime da Casa %d X %d Time Visitante\n\n", casa.getPontos(),
							visitante.getPontos());
					break;
				}
				case 3: {
					casa.addPoints();
					System.out.println("\n+ 1 Ponto Time da Casa!\n");
					break;
				}
				case 4: {
					casa.removePoints();
					System.out.println("\n- 1 Ponto Time da Casa!\n");
					break;
				}
				case 5: {
					visitante.addPoints();
					System.out.println("\n+ 1 Ponto Time Visitante!\n");
					break;
				}
				case 6: {
					visitante.removePoints();
					System.out.println("\n- 1 Ponto Time Visitante!\n");
					break;
				}
				default:
					break;
				}
			} catch (InputMismatchException Exception) {
				System.out.println("Caractere inválido");
				keyboard.next();
			}
		}

		if (casa.getPontos() > visitante.getPontos()) {
			System.out.println("\nO resultado do jogo é: Time da Casa Vencedor\n");
		} else if (casa.getPontos() < visitante.getPontos()) {
			System.out.println("\nO resultado do jogo é: Time Visitante Vencedor\n");
		} else if (casa.getPontos() == visitante.getPontos()) {
			System.out.println("\nJogo empatado!\n");
		}
		System.out.println("Até a próxima...");

	}

}
