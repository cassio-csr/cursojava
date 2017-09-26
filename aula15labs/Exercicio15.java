package aula15labs;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o lado 1 do tri�ngulo:");
		double lado1 = scan.nextDouble();

		System.out.println("Informe o lado 2 do tri�ngulo:");
		double lado2 = scan.nextDouble();

		System.out.println("Informe o lado 3 do tri�ngulo:");
		double lado3 = scan.nextDouble();

		if ((lado1 + lado2) > lado3 || (lado2 + lado3) > lado1 ||
			(lado1 + lado3) > lado2) {
			if (lado1 == lado2 && lado2 == lado3) {
				System.out.println("Tri�ngulo Equil�tero");
			} else if (lado1 == lado2 || lado1 == lado3 || 
				lado2 == lado3) {
				System.out.println("Tri�ngulo Is�sceles");
			} else {
				System.out.println("Tri�ngulo Escaleno");
			}
		} else {
			System.out.println("N�o � um tir�ngulo");
		}	
	}
}
