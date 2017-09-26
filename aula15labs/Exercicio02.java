package aula15labs;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número:");
		double numero = scan.nextDouble();
		
		if (numero > 0) {
			System.out.println("O número é positivo.");
		} else if (numero < 0) {
			System.out.println("O número é negativo.");
		} else {
			System.out.println("Número inválido.");
		}
	}

}
