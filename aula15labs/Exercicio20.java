package aula15labs;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Programa de interrogat�rio <S-sim> <N-n�o>");
		
		String resposta = null;
		int envolvimento = 0;
		
		System.out.println("Telefonou para a v�tima?");
		resposta = scan.next();
		if (resposta.equalsIgnoreCase("S")) {
			envolvimento++;
		}
		
		System.out.println("Esteve no local do crime?");
		resposta = scan.next();
		if (resposta.equalsIgnoreCase("S")) {
			envolvimento++;
		}
		
		System.out.println("Mora perto da v�tima?");
		resposta = scan.next();
		if (resposta.equalsIgnoreCase("S")) {
			envolvimento++;
		}
		
		System.out.println("Devia para a v�tima?");
		resposta = scan.next();
		if (resposta.equalsIgnoreCase("S")) {
			envolvimento++;
		}
		
		System.out.println("J� trabalhou com a v�tima?");
		resposta = scan.next();
		if (resposta.equalsIgnoreCase("S")) {
			envolvimento++;
		}
		
		System.out.print("Participa��o no crime clasificado como ");
		
		if (envolvimento == 2 ) {
			System.out.println("Suspeita");
		} else if (envolvimento == 3 || envolvimento == 4) {
			System.out.println("C�mplice");
		} else if (envolvimento == 5) {
			System.out.println("Assassino");
		} else {
			System.out.println("Inocente");
		}
	}

}
