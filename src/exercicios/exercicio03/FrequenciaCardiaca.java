package exercicios.exercicio03;

import java.time.LocalDate;

public class FrequenciaCardiaca {
	private String nome;
	private String sobrenome;
	private String dataNascimento;
	private int idade;
	private int maxFreqCard;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public FrequenciaCardiaca(String name, String lastName, String birthday) {

		this.nome = name;
		this.sobrenome = lastName;
		this.dataNascimento = birthday;
	}

	// CALCULA IDADE - Esta função considera que o valor da data de nascimento
	// passada foi uma string no formato dd/mm/yyyy
	public int getAge() {
		int mes = Integer.parseInt(dataNascimento.substring(3, 5));
		int ano = Integer.parseInt(dataNascimento.substring(6));
		LocalDate today = LocalDate.now();

		if (mes > today.getMonthValue()) {			
			idade = today.getYear() - ano - 1;
		} else {
			idade = (today.getYear() - ano) ;
		}
		System.out.printf("Sua idade é %d\n", idade);
		return idade;
	}
	
	public int getFrequency() {
		maxFreqCard = 200 - idade;
		System.out.printf("Sua Frequencia Cardiaca Maxima é %d\n", maxFreqCard);
		return maxFreqCard;
	}
	
	public void getTarget() {
		double min1 = maxFreqCard * 0.50;
		double min2 = maxFreqCard * 0.85;
		System.out.printf("Sua Frequencia Alvo é entre %.0f e %.0f\n",  min1, min2);
	}
	
	
	

}
