package exercicios.exercicio07;

public class Aluno {
	
	String codigo;
	int credito;
	
	public Aluno(String codigo, int credito) {
		this.codigo = codigo;
		this.credito = credito;
	}

	@Override
	public String toString() {
		return "Aluno (AR" + codigo + ") - Créditos: " + credito;
	}

}
