package aula13labs;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro numero inteiro:");
		int primeiroNumero = scan.nextInt();
		
		System.out.println("Informe o segundo numero inteiro:");
		int segundoNumero = scan.nextInt();
		
		int soma = primeiroNumero + segundoNumero;
		System.out.println("A soma é igual a " + soma);

	}

}
