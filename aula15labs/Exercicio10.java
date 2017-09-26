package aula15labs;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Qual o turno que voc� estuda?\nDigite " +
			" as letras: M-matutino V-vespertino ou N-noturno");
		String turno = scan.next();
		
		switch(turno) {
		case "M":
			System.out.println("Bom Dia!");
		break;
		case "V":
			System.out.println("Boa Tarde!");
		break;
		case "N":
			System.out.println("Boa Noite!");
		break;
		default:
			System.out.println("Valor inválido!");
		}
	}
}
