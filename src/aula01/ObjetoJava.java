package aula01;

public class ObjetoJava {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.saldo = 100;
		
		Conta c2 = new Conta();
		c2.saldo = 100;
		
		//System.out.printf("O saldo de c1 � %f%n", c1.saldo);
		//System.out.printf("O saldo de c2 � %f", c2.saldo);
		
		System.out.println(c2.saldo == c1.saldo);
	}

}