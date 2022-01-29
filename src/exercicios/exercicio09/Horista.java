package exercicios.exercicio09;

public class Horista extends Funcionario{

	
	public Horista(double salario, String nome) {
		super(salario, nome);

	}

	double comissao = 55;
	public void calculoDiaSalario() {
		salario += (comissao * 6);
	}
	
	
	
}
