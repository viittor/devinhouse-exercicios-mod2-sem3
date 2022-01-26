package exercicios.exercicio06;

public class Linguagem {

	String linguagem;
	float versao;

	public Linguagem() {
		this.linguagem = "Java";
		this.versao = 1;
		metodo4(linguagem, versao);
	}

	public Linguagem(String linguagem) {
		this.linguagem = linguagem;
		this.versao = 1;
		metodo4(linguagem, versao);
	}

	public Linguagem(float versao) {
		this.linguagem = "Java";
		this.versao = versao;
		metodo4(linguagem, versao);
	}

	public Linguagem(String linguagem, float versao) {
		this.linguagem = linguagem;
		this.versao = versao;
		metodo4(linguagem, versao);
	}

	public void metodo4(String linguagem, float versao) {
		System.out.printf("Liguagem: %s - Versão: %.2f\n", linguagem, versao);
	}

	@Override
	public String toString() {
		return "Linguagem: " + this.linguagem + " - Versão: " + this.versao;

	}

}
