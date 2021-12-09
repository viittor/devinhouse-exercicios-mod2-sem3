package mensageiroo;

public class Mensagem {

	private Pessoa remetente;
	private String corpoDeTexto;

	public Mensagem(Pessoa remetente, String corpoDeTexto) {
		this.corpoDeTexto = corpoDeTexto;
		this.remetente = remetente;
	}

	public Pessoa getRemetente() {
		return remetente;
	}

	public String getCorpoDeTexto() {
		return corpoDeTexto;
	}

	@Override
	public String toString() {
		
		return String.format("%s : %s", this.getRemetente().getUsername(), this.getCorpoDeTexto());
	}
}
