package aula15labs;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira um número inteiro!");
		int numero = scan.nextInt();
		
		if ((numero % 2) == 0) {
			System.out.println("Este número é par!");
		} else {
			System.out.println("Este número é impar!");
		}
	}

}
