package aula01;

public class ObjetoJava {

	public static void main(String[] args) {
//		int a = 10;
//		int b = a;
//		b = 20;
//		
//		System.out.printf("O Valor de a � %d", a);
//		System.out.printf("\nO Valor de b � %d", b);
		
		Conta c1 = new Conta();
		c1.saldo = 100;
		
		Conta c2 = c1;
		c2.saldo = 200;
		System.out.println(c1); //mostra o endere�o da mem�ria
		System.out.println(c2.saldo); //mostra o valor armazenado. Tipo Primitivo
	}

}
