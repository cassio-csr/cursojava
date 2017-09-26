package aula15labs;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Programa de interrogatório <S-sim> <N-não>");
		
		String resposta = null;
		int envolvimento = 0;
		
		System.out.println("Telefonou para a vítima?");
		resposta = scan.next();
		if (resposta.equalsIgnoreCase("S")) {
			envolvimento++;
		}
		
		System.out.println("Esteve no local do crime?");
		resposta = scan.next();
		if (resposta.equalsIgnoreCase("S")) {
			envolvimento++;
		}
		
		System.out.println("Mora perto da vítima?");
		resposta = scan.next();
		if (resposta.equalsIgnoreCase("S")) {
			envolvimento++;
		}
		
		System.out.println("Devia para a vítima?");
		resposta = scan.next();
		if (resposta.equalsIgnoreCase("S")) {
			envolvimento++;
		}
		
		System.out.println("Já trabalhou com a vítima?");
		resposta = scan.next();
		if (resposta.equalsIgnoreCase("S")) {
			envolvimento++;
		}
		
		System.out.print("Participação no crime clasificado como ");
		
		if (envolvimento == 2 ) {
			System.out.println("Suspeita");
		} else if (envolvimento == 3 || envolvimento == 4) {
			System.out.println("Cúmplice");
		} else if (envolvimento == 5) {
			System.out.println("Assassino");
		} else {
			System.out.println("Inocente");
		}
	}

}
