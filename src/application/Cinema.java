package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProgramaEntretenimento;

public class Cinema {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Nome: ");
		String nome = sc.nextLine();

		System.out.println("Categoria: ");
		String categoria = sc.nextLine();

		System.out.println("Personagem Principal: ");
		String personagemPrincipais = sc.nextLine();

		System.out.println("Faixa etaria: ");
		int faixaEtaria = sc.nextInt();

		System.out.println("Classificação: ");
		sc.nextLine();
		String classificacao = sc.nextLine();

		System.out.println("Nota de classificacao");
		double notaClassificacao = sc.nextDouble();

		System.out.println("Duracao: ");
		sc.nextLine();
		String duracao = sc.nextLine();

		ProgramaEntretenimento programa = new ProgramaEntretenimento(nome, categoria, personagemPrincipais, faixaEtaria,
				classificacao, notaClassificacao, duracao);

		System.out.println(programa.toString());

		System.out.println("Avaliacao do filme: " + programa.getNotaClassificacao());
		programa.classificarPrograma();

	}

}
