package aula15labs;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o valor de a:");
		int varA = scan.nextInt();
		int varB = 0, varC = 0;
		if (varA != 0) {
			System.out.println("Informe o valor de b:");
			varB = scan.nextInt();

			System.out.println("Informe o valor de c:");
			varC = scan.nextInt();
			
			double delta = ((Math.pow(varB,2)) - (4 * varA * varC));
			double varX1 = ((-varB - Math.sqrt(delta)) / (2 * varA));
			double varX2 = ((-varB + Math.sqrt(delta)) / (2 * varA));
			if (delta < 0) {
				System.out.println("O Delta é negativo, portanto a "
					+ "equação não possui raizes reais!");
			} else if (delta == 0) {
				System.out.println("O Delta é igual a zéro, portanto a "
					+ "equação possui apenas uma raiz real!");
				System.out.println("X\' = " + varX1 + " e X\" = " + varX2);
			} else if (delta > 0 ) {
				System.out.println("O Delta é positivo, portanto a "
					+ "equação possui duas raizes reais!");
				System.out.println("X\' = " + varX1 + " e X\" = " + varX2);
			}
		} else {
			System.out.println("A equação não é do segundo grau!");
		}			
	}
}
