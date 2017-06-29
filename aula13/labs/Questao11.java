package aula13.labs;

import java.util.Scanner;

public class Questao11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro:");
		int primeiroNumero = scan.nextInt();
		
		System.out.println("Informe outro número inteiro:");
		int segundoNumero = scan.nextInt();
		
		System.out.println("Informe um número real:");
		double terceiroNumero = scan.nextDouble();
		
		int calculo1 = (primeiroNumero * 2) * (segundoNumero / 2);
		double calculo2 = primeiroNumero * 3 + terceiroNumero;
		double calculo3 = Math.pow(terceiroNumero, 3);
		
		System.out.println("O produto do dobro do primeiro com metade do segundo: " + calculo1);
		System.out.println("A soma do triplo do primeiro com o terceiro: " + calculo2);
		System.out.println("O terceiro elevado ao cubo: " + calculo3);

	}

}
