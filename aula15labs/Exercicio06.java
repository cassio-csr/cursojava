package aula15labs;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Insira o primeiro n�mero inteiro:");
		int numero1 = scan.nextInt();

		System.out.println("Insira o segundo n�mero inteiro:");
		int numero2 = scan.nextInt();

		System.out.println("Insira o terceiro n�mero inteiro:");
		int numero3 = scan.nextInt();

		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println("O maior n�mero � o " + numero1);
		} else if (numero2 > numero1 && numero2 > numero3) {
			System.out.println("O maior n�mero � o " + numero2);
		} else if (numero3 > numero1 && numero3 > numero2) {
			System.out.println("O maior n�mero � o " + numero3);
		}
	}
}
