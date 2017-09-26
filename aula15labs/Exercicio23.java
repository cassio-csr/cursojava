package aula15labs;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe qual o tipo de carne?");
		System.out.println("\t\t  T  a  b  e  l  a");
		System.out.println("\t\t\tAté 5 Kg\t\tAcima de 5 Kg");
		System.out.println("1- Filé Duplo\t\tR$ 4,90 por Kg\t\tR$ 5,80 por Kg");
		System.out.println("2- Alcatra\t\tR$ 5,90 por Kg\t\tR$ 6,80 por Kg");
		System.out.println("3- Picanha\t\tR$ 6,90 por Kg\t\tR$ 7,80 por Kg");
		int tipo = scan.nextInt();
		String produto = null;
		
		System.out.println("Informe quantos Kilos?");
		double kilos = scan.nextDouble();
		
		double subTotal = 0;
		if (kilos > 5) {
			switch (tipo) {
			case 1:
				subTotal = kilos * 5.8;
				produto = "Filé Duplo";
			break;
			case 2:
				subTotal = kilos * 6.8;
				produto = "Alcatra";
			break;
			case 3:
				subTotal = kilos * 7.8;
				produto = "Picanha";
			break;
			}
		} else {
			switch (tipo) {
			case 1:
				subTotal = kilos * 4.9;
				produto = "Filé Duplo";
			break;
			case 2:
				subTotal = kilos * 5.9;
				produto = "Alcatra";
			break;
			case 3:
				subTotal = kilos * 6.9;
				produto = "Picanha";
			break;
			}
		}
		
		System.out.println("Valor da compra: R$" + subTotal);
		System.out.print("Qual a forma de pagamento?\n<1-Dinheiro> "
				+ "<2-Cartão Tabajara>\n");
		int cartao = scan.nextInt();
		
		String formaPagamento = null;
		double desconto = 0;
		if (cartao == 2) {
			desconto = subTotal * 5 / 100;
			formaPagamento = "Cartão Tabajara";
		} else {
			formaPagamento = "Dinheiro";
		}
		
		double total = subTotal - desconto;
		
		System.out.println("\n\nHipermercado Tabajara");
		System.out.println("Quant\tProduto\t\tValor");
		System.out.println(kilos + "\t" + produto + "\t\tR$" + subTotal);
		System.out.println("Forma de pagamento: " + formaPagamento);
		System.out.println("Desconto: R$" + desconto);
		System.out.println("Valor a pagar: R$" + total);
	}

}
