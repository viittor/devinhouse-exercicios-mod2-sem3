package mensageiroo;

import java.util.ArrayList;
import java.util.List;

public class AppMensageiroo {

	public static void main(String[] args) {
		Pessoa eu = new Pessoa("user1");
		Pessoa voce = new Pessoa("user2");
		
		List<Pessoa> participantesDaConversa = new ArrayList<Pessoa>();
		
		participantesDaConversa.add(eu);
		participantesDaConversa.add(voce);
		
		Conversa conversa = new Conversa(participantesDaConversa);
		
		conversa.enviarMensagem(eu, "Hello World");
		
		for(Mensagem mensagem : conversa.getTimeline()) {
			System.out.println(mensagem);
		}
		
	}

}
