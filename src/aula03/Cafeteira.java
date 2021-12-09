package aula03;

public class Cafeteira {

	private boolean isLigada;
	private int qtdAgua;
	private int qtdGraos;

	private Filtro filtro;
	private Moedor moedor;

	public Cafeteira(int qtdMaxAgua, int qtdMaxGraos) {// construtor
		this.isLigada = false;
		this.qtdAgua = qtdMaxAgua;
		this.qtdGraos = qtdMaxGraos;

		this.filtro = new Filtro();// instancia o objeto Filtro
		this.moedor = new Moedor();// instancia o objeto Moedor
	}

	public void ligaCafeteira() {// metodo para ligar
		this.isLigada = true;
	}

	public void fazerCafe(int qtdCafe) {// metodo para fazer cafe
		if (this.isLigada && this.qtdAgua > 0 && this.qtdGraos > 2) {
			this.qtdGraos -= this.moedor.moerCafe();// pega o valor que foi usado pelo moedor e decrementa do total de
													// grãos.
			this.qtdAgua -= this.filtro.filtrarCafe();// pega o valor que foi usado pelo filtro e decrementa do total de
														// agua.

			System.out.println("Café fresquinho saindo...");

		}
	}

}
