package aula15labs;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantos litros foram vendidos?");
		double litros = scan.nextDouble();
		
		System.out.print("Qual do tipo de combustível?\n<A-álcool> <G-gasolina>\n");
		String tipoCombustivel = scan.next();
		
		double subTotal = 0;
		double desconto = 0;
		double total = 0;
		
		switch (tipoCombustivel) {
		case "A":
			subTotal = litros * 1.9;
			System.out.println("Tipo de combustível\t: Álcool");
			System.out.println("Sub Total\t\t: " + subTotal);
			if (litros <= 20) {
				desconto = subTotal * 3 / 100;
				total  = subTotal - desconto;
			} else {
				desconto = subTotal * 5 / 100;
				total  = subTotal - desconto;
			}
			System.out.println("Desconto\t\t: " + desconto);
			System.out.println("Total\t\t\t: " + total);
		break;
		case "G":
			subTotal = litros * 2.5;
			System.out.println("Tipo de combustível\t: Gasolina");
			System.out.println("Sub Total\t\t: " + subTotal);
			if (litros <= 20) {
				desconto = subTotal * 4 / 100;
				total  = subTotal - desconto;
			} else {
				desconto = subTotal * 6 / 100;
				total  = subTotal - desconto;
			}
			System.out.println("Desconto\t\t: " + desconto);
			System.out.println("Total\t\t\t: " + total);
		break;
		}
	}
}
