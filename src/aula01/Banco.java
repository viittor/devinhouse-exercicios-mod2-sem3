package aula01;

public class Banco {

	public static void main(String[] args) {
		Conta minhaConta = new Conta();
		Conta segundaConta = new Conta();
		
		minhaConta.nomeDoTitular = "Victor";
		minhaConta.saldo = 100;
		segundaConta.nomeDoTitular = "Pedro";
		segundaConta.saldo = 100;
		
		
		
		System.out.printf("O saldo atual do cliente %s é de %.2f", minhaConta.nomeDoTitular, minhaConta.saldo);

	}

}
