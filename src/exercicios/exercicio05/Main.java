package exercicios.exercicio05;

public class Main {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		
		agenda.armazenaPessoa("Victor", 15, 175);
		agenda.armazenaPessoa("Pedro", 15, 175);
		agenda.armazenaPessoa("Marcio", 15, 175);
		agenda.armazenaPessoa("Luis", 15, 175);
		agenda.armazenaPessoa("Mario", 15, 175);
		agenda.armazenaPessoa("Joao", 15, 175);
		agenda.armazenaPessoa("Augusto", 15, 175);
		agenda.armazenaPessoa("Antonio", 15, 175);
		agenda.armazenaPessoa("Michael", 15, 175);
		agenda.armazenaPessoa("Pericles", 15, 175);
		
		agenda.imprimeAgenda();
		
	
	}

}
