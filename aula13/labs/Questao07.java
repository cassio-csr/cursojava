package aula13.labs;

import java.util.Scanner;

public class Questao07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o tamnhanho do lado do quadrado:");
		double lado = scan.nextDouble();
		
		double area = Math.pow(lado, 2);
		System.out.println("A �rea do quadrado � " + area);
		System.out.println("O dobro da �rea do quadrado � " + (area * 2));

	}

}
