package exercicios.exercicio01;

public class TestaPessoa {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		
		System.out.println(pessoa.getIdade());
		pessoa.fazAniversário();
		System.out.println(pessoa.getIdade());
		
	}

}
