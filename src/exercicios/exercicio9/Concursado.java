package exercicios.exercicio9;

public class Concursado extends Funcionario {

	public Concursado(double salario, String nome) {
		super(salario, nome);
	}

	double salarioInicial = salario;

	public double getSalarioInicial() {
		return salarioInicial;
	}

	public void setSalarioInicial(double salarioInicial) {
		this.salarioInicial = salarioInicial;
	}

	double comissao = salarioInicial * 0.05;

	public void calculoDiaSalario() {
		salario = salarioInicial + comissao;
		
		if(salario > (salarioInicial * 0.65)) {
			System.out.println("Valor Limite Atingido");
			salario *= 0.65;
		}
	}

}
