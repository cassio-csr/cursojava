package aula13labs;

import java.util.Scanner;

public class Questao12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a altura:");
		double altura = scan.nextDouble();

		double pesoIdeal = (72.7 * altura) - 58;
		System.out.println("O peso ideal é " + pesoIdeal + "Kg");
	}

}
