package exercicios.exercicio02;

public class TestaFatura {

	public static void main(String[] args) {

		Fatura fatura = new Fatura();
		
		System.out.println("Fatura " + fatura.getNumero());
		System.out.println("Descri��o: "+fatura.getDescricao());
		System.out.println("O total da fatura �: " + fatura.getValorFatura());
		
		
	}

}
