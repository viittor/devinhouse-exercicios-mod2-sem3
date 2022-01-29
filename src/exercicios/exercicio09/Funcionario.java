package exercicios.exercicio09;

public abstract class Funcionario {

	double salario;
	String nome;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public Funcionario(double salario, String nome) {
		super();
		this.salario = salario;
		this.nome = nome;
	}
	
	

}
