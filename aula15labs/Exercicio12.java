package aula15labs;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o valor da hora:");
		double valorHora = scan.nextDouble();

		System.out.println("Informe a quantidade de horas trabalhadas:");
		double horasTrabalhadas = scan.nextDouble();

		double salarioBruto = 0, percentualIr = 0, valorIr = 0, inss = 0,
			fgts = 0, descontos = 0, salarioLiquido = 0;
		
		salarioBruto = valorHora * horasTrabalhadas;
		
		if (salarioBruto > 900 && salarioBruto <= 1500) {
			percentualIr = 5;
		} else if (salarioBruto > 1500 && salarioBruto <= 2500) {
			percentualIr = 10;
		} else if (salarioBruto > 2500) {
			percentualIr = 20;
		}

		valorIr = salarioBruto * percentualIr / 100;
		inss = salarioBruto * 10 / 100;
		fgts = salarioBruto * 11 / 100;
		descontos = valorIr + inss;
		salarioLiquido = salarioBruto - descontos;
		
		System.out.println("Salário Bruto: (" + valorHora + " * " +
			horasTrabalhadas + ")\t: R$ " + salarioBruto);
		System.out.println("( - ) IR (" + percentualIr + "%)\t\t: R$ " +
			valorIr);
		System.out.println("( - ) INSS (10%)\t\t: R$ " + inss);
		System.out.println("FGTS (11%)\t\t\t: R$ " + fgts);
		System.out.println("Total de descontos\t\t: R$ " + descontos);
		System.out.println("Salário Líquido\t\t\t: R$ " + salarioLiquido);
	}
}
