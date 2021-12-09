package aula03;

public class HoraDoCafe {
	private static final int QTD_MAX_AGUA = 100; //implementação de constante
	private static final int QTD_CAFEZINHO = 5;//implementação de constante
	private static final int QTD_MAX_GRAOS = 5;//implementação de constante

	public static void main(String[] args) {
		Cafeteira cafeteira = new Cafeteira(QTD_MAX_AGUA, QTD_MAX_GRAOS);
		
		cafeteira.ligaCafeteira();
		cafeteira.fazerCafe(QTD_CAFEZINHO);

		
		
	}

}
