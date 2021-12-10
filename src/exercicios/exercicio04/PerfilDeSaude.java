package exercicios.exercicio04;

import java.time.LocalDate;

public class PerfilDeSaude {

	private String name;
	private String lastName;
	private String gender;
	private String birthday;
	private double height;
	private double weight;
	private int idade;
	private int maxFreqCard;
	private double imc;

	public PerfilDeSaude(String name, String lastName, String gender, String birthday, double height, double weight) {
		this.name = name;
		this.lastName = lastName;
		this.gender = gender;
		this.birthday = birthday;
		this.height = height;
		this.weight = weight;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	public String getGender() {
		return gender;
	}

	// CALCULA IDADE - Esta função considera que o valor da data de nascimento
	// passada foi uma string no formato dd/mm/yyyy
	public int getAge() {
		int mes = Integer.parseInt(birthday.substring(3, 5));
		int ano = Integer.parseInt(birthday.substring(6));
		LocalDate today = LocalDate.now();

		if (mes > today.getMonthValue()) {
			idade = today.getYear() - ano - 1;
		} else {
			idade = (today.getYear() - ano);
		}
		System.out.printf("Sua idade é %d\n", idade);
		return idade;
	}

// CALCULA FREQUENCIA CARDIACA MAXIMA
	public int getFrequency() {
		maxFreqCard = 200 - idade;
		System.out.printf("Sua Frequencia Cardiaca Maxima é %d\n", maxFreqCard);
		return maxFreqCard;
	}

	// CALCULA FREQUENCIA ALVO
	public void getTarget() {
		double min1 = maxFreqCard * 0.50;
		double min2 = maxFreqCard * 0.85;
		System.out.printf("Sua Frequencia Alvo é entre %.0f e %.0f\n", min1, min2);
	}

	// CALCULA IMC
	public void getIMC() {
		imc = weight /(height * height);
		System.out.printf("Seu IMC é %.2f \n", imc);
	}

}
