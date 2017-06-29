package aula13labs;

import java.util.Scanner;

public class Questao05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira a quantidade em metros:");
		double metros = scan.nextDouble();
		
		double centimetros = metros * 100;
		System.out.println("Corresponde a " + centimetros + " centimetros.");

	}

}
