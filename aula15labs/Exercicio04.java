package aula15labs;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma letra:");
		String letra = scan.next();
		
		System.out.print("A letra digitada é uma ");
		if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") ||
				letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") ||
				letra.equalsIgnoreCase("u")) {
			System.out.println("vogal.");
		} else {
			System.out.println("consoante.");
		}
	}

}
