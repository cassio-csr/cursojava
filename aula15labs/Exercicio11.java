package aula15labs;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Para o cálculo, insira o salário atual:");
		double salarioAtual = scan.nextDouble();

		double percentual = 0, valorAumento = 0, salarioNovo = 0;

		if (salarioAtual <= 280) {
			percentual = 20;
			valorAumento = salarioAtual * percentual / 100;
			salarioNovo = salarioAtual + valorAumento;
		} else if (salarioAtual > 280 && salarioAtual <= 700) {
			percentual = 15;
			valorAumento = salarioAtual * percentual / 100;
			salarioNovo = salarioAtual + valorAumento;
		} else if (salarioAtual > 700 && salarioAtual <= 1500) {
			percentual = 10;
			valorAumento = salarioAtual * percentual / 100;
			salarioNovo = salarioAtual + valorAumento;
		} else if (salarioAtual > 1500) {
			percentual = 5;
			valorAumento = salarioAtual * percentual / 100;
			salarioNovo = salarioAtual + valorAumento;
		}

		System.out.println("Salário sem reajuste: " + "R$" + salarioAtual);
		System.out.println("Percentual de reajuste: " + percentual + "%");
		System.out.println("Valor de reajuste: " + "R$" + valorAumento);
		System.out.println("Salário com reajuste: " + "R$" + salarioNovo);
	}
}
