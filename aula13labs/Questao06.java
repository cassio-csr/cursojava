package aula13labs;

import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira o raio da circunferencia:");
		double raio = scan.nextDouble();
		
		double area = Math.PI * Math.pow(raio, 2);
		System.out.println("A ára da circunferência é: " + area);

	}

}
