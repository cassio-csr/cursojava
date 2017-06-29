package aula13.labs;

import java.util.Scanner;

public class Questao08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor por hora?");
		double salarioHora = scan.nextDouble();
		
		System.out.println("Informe a quantidade de horas trabalhadas.");
		double horasTrabalhadas = scan.nextDouble();
		
		double salarioTotal = salarioHora * horasTrabalhadas;
		System.out.println("O salário é de: " + salarioTotal);

	}

}
