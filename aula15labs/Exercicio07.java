package aula15labs;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Insira o primeiro número inteiro:");
		int numero1 = scan.nextInt();

		System.out.println("Insira o segundo número inteiro:");
		int numero2 = scan.nextInt();

		System.out.println("Insira o terceiro número inteiro:");
		int numero3 = scan.nextInt();

		if (numero1 > numero2 && numero1 > numero3) {
			System.out.print("O maior número é o " + numero1);
		} else if (numero2 > numero1 && numero2 > numero3) {
			System.out.print("O maior número é o " + numero2);
		} else if (numero3 > numero1 && numero3 > numero2) {
			System.out.print("O maior número é o " + numero3);
		}

		if (numero1 < numero2 && numero1 < numero3) {
			System.out.println(" e o menor número é o " + numero1);
		} else if (numero2 < numero1 && numero2 < numero3) {
			System.out.println(" e o menor número é o " + numero2);
		} else if (numero3 < numero1 && numero3 < numero2) {
			System.out.println(" e o menor número é o " + numero3);
		}
	}
}
