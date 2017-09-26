package aula15labs;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantos Kg de morango?");
		double KgMorango = scan.nextDouble();
		double precoMorango = 0;
		if (KgMorango > 5) {
			precoMorango = 2.2;
		} else {
			precoMorango = 2.5;
		}
		double totalMorango = KgMorango * precoMorango;
		
		System.out.println("Quantos Kg de maçã?");
		double KgMaca = scan.nextDouble();
		double precoMaca = 0;
		if (KgMaca > 5) {
			precoMaca = 1.5;
		} else {
			precoMaca = 1.8;
		}
		double totalMaca = KgMaca * precoMaca;
		
		double subTotal = totalMorango + totalMaca;
		double desconto = 0;
		if ((KgMorango + KgMaca) > 8 || (subTotal) > 25) {
			desconto = subTotal * 10 / 100;
		}
		double total = subTotal - desconto;
		
		System.out.println("Quant\t\tProduto\t\tSub Total");
		System.out.println(KgMorango + "\t\tMorango\t\t" + totalMorango);
		System.out.println(KgMaca + "\t\tMaçã\t\t" + totalMaca);
		System.out.println("Sub Total\t: " + subTotal);
		System.out.println("Desconto\t: " + desconto);
		System.out.println("Total\t: " + total);
	}

}
