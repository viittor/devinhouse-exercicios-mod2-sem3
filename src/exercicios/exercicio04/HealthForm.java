package exercicios.exercicio04;

import java.util.Scanner;

public class HealthForm {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Qual seu nome?");
		String nome = keyboard.nextLine();
		System.out.println("Qual seu sobrenome?");
		String sobrenome = keyboard.nextLine();
		System.out.println("Qual seu Genero?");
		String genero = keyboard.nextLine();
		System.out.println("Qual sua data de nascimento? (dd/mm/yyyy)");
		String aniversario = keyboard.nextLine();
		System.out.println("Qual sua altura? (Metros)");
		double altura = keyboard.nextDouble();
		System.out.println("Qual seu peso? (kg)");
		double peso = keyboard.nextDouble();
		
		PerfilDeSaude perfil = new PerfilDeSaude(nome, sobrenome, genero, aniversario, altura, peso);
		
		System.out.println("=== PERFIL DE SAUDE ===");
		
		System.out.println("Seu nome � " + perfil.getName());
		System.out.println("Seu sobrenome � " + perfil.getLastName());
		System.out.println("Seu sexo � " + perfil.getGender());
		System.out.println("Sua data de Nascimento � " + perfil.getBirthday());
		System.out.println("Sua altura � " + perfil.getHeight());
		System.out.println("Seu peso � " + perfil.getWeight());
		
		perfil.getAge();
		perfil.getIMC();
		perfil.getFrequency();
		perfil.getTarget();
	}

}
