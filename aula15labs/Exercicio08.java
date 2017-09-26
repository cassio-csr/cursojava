package aula15labs;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Qual o preço do primeiro produto?");
		double preco1 = scan.nextDouble();

		System.out.println("Qual o preço do segundo produto?");
		double preco2 = scan.nextDouble();

		System.out.println("Qual o preço do terceiro produto?");
		double preco3 = scan.nextDouble();

		if (preco1 < preco2 && preco1 < preco3) {
			System.out.println("Você deve comprar o primeiro produto!");
		} else if (preco2 < preco1 && preco2 < preco3) {
			System.out.println("Você deve comprar o segundo produto!");
		} else if (preco3 < preco1 && preco3 < preco2) {
			System.out.println("Você deve comprar o terceiro produto!");
		}
	}
}
