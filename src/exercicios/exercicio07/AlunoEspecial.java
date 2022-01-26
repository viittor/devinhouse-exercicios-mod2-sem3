package exercicios.exercicio07;

public class AlunoEspecial extends Aluno{

	public AlunoEspecial(String codigo, int credito) {
		super(codigo, credito);
		
		if(credito > 10) {
			credito = 10;
		}
		this.credito = credito;
	}
	
	@Override
	public String toString() {
		return "Aluno (AE" + codigo + ") - Créditos: " + credito;
	}
	

}