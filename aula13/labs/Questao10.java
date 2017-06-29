package aula13.labs;

import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em Celsius:");
		double celsius = scan.nextDouble();
		
		double fahrenheit = ((9 * celsius / 5) + 32);
		System.out.println(celsius + "C corresponde a " + fahrenheit + " F");

	}

}
