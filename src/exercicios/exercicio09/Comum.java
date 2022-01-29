package exercicios.exercicio09;

public class Comum extends Funcionario{

	public Comum(double salario, String nome) {
		super(salario, nome);
	}
	
	double comissao = 100;
	public void calculoDiaSalario() {
		salario += comissao;
	}

}
