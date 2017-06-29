package aula13.labs;

import java.util.Scanner;

public class Questao13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor por hora?");
		double salarioHora = scan.nextDouble();
		
		System.out.println("Informe quantas horas trabalhadas.");
		double horasTrabalhadas = scan.nextDouble();
		
		double salarioBruto = salarioHora * horasTrabalhadas;
		double irpf = salarioBruto * 11 / 100;
		double inss = salarioBruto * 8 / 100;
		double sindical = salarioBruto * 5 / 100;
		double descontos = irpf + inss + sindical;
		double salarioLiquido = salarioBruto - descontos;
		
		System.out.println("Salario bruto: " + salarioBruto);
		System.out.println("Imposto de renda: " + irpf);
		System.out.println("INSS: " + inss);
		System.out.println("Contribuição sindical: " + sindical);
		System.out.println("Total de descontos: " + descontos);
		System.out.println("Salário líquido: " + salarioLiquido);
	}

}
