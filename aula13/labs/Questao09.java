package aula13.labs;

import java.util.Scanner;

public class Questao09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em graus farenheit:");
		double fahrenheit = scan.nextDouble();
		
		double celcius = (5 * (fahrenheit - 32) / 9);
		System.out.println(fahrenheit + " fahrenheit corresponde a " + celcius + " Celcius");

	}

}
