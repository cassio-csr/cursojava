package aula15labs;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro n�mero inteiro:");
		int num1 = scan.nextInt();
		
		System.out.println("Informe o segundo n�mero inteiro:");
		int num2 = scan.nextInt();
		
		if (num1 > num2) {
			System.out.println("O maior � " + num1);
		} else {
			System.out.println("O maior � " + num2);
		}

	}

}
