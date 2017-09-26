package aula15labs;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o lado 1 do triângulo:");
		double lado1 = scan.nextDouble();

		System.out.println("Informe o lado 2 do triângulo:");
		double lado2 = scan.nextDouble();

		System.out.println("Informe o lado 3 do triângulo:");
		double lado3 = scan.nextDouble();

		if ((lado1 + lado2) > lado3 || (lado2 + lado3) > lado1 ||
			(lado1 + lado3) > lado2) {
			if (lado1 == lado2 && lado2 == lado3) {
				System.out.println("Triângulo Equilátero");
			} else if (lado1 == lado2 || lado1 == lado3 || 
				lado2 == lado3) {
				System.out.println("Triângulo Isósceles");
			} else {
				System.out.println("Triângulo Escaleno");
			}
		} else {
			System.out.println("Não é um tirângulo");
		}	
	}
}
