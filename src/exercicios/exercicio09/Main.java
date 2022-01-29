package exercicios.exercicio09;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Comum comum = new Comum(1000.00, "Comum");
		Horista horista = new Horista(1200.00, "Horista");
		Concursado concursado = new Concursado(1500.00, "Concursado");
		ArrayList<String> funcionarios = new ArrayList<String>();
		double somaSalario = 0;

		System.out.println("|----------------------------------|\n" + "| Sistema De Folha de Pagamento    |\n"
				+ "|----------------------------------|\n" + "|  1: Ver funcionarios             |\n"
				+ "|  2: Novo Funcionario             |\n" + "|  3: Novo Funcionario Horista     |\n"
				+ "|  4: Novo Funcionario Concursado  |\n" + "|  5: Ver folha de pagto (10 dias) |\n"
				+ "|  6: Ver folha de pagto (21 dias) |\n" + "|  0: Sair                         |\n"
				+ "|----------------------------------|");

		Scanner keyboard = new Scanner(System.in);
		int escolha = -1;

		while (escolha != 0) {
			System.out.print("Sua escolha: ");
			escolha = keyboard.nextInt();

			switch (escolha) {
			case 1:
				System.out.println(funcionarios.toString());
				break;
			case 2:
				System.out.print("Funcionário adicionado\n");
				funcionarios.add(comum.getNome());
				somaSalario += comum.getSalario();
				break;
			case 3:
				System.out.print("Horista adicionado\n");
				funcionarios.add(horista.getNome());
				somaSalario += horista.getSalario();
				break;
			case 4:
				System.out.print("Concursado adicionado\n");
				funcionarios.add(concursado.getNome());
				somaSalario += concursado.getSalario();
				break;
			case 5:
				System.out.println("Salarios (10 Dias)");
				double totalDez = somaSalario * 10;
				System.out.printf("Total: R$ %.2f \n", totalDez);
				break;
			case 6:
				System.out.println("Salarios (21 Dias)");
				double totalVinteUm = somaSalario * 21;
				System.out.printf("Total: R$ %.2f \n", totalVinteUm);
				break;
			case 0:
				System.out.print("Encerrando sistema...");
				System.exit(0);
				break;
			default:
				break;

			}
		}
		
		keyboard.close();

	}

}
