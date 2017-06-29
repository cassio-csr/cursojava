package aula13labs;

import java.util.Scanner;

public class Questao14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do arquivo em MB:");
		double tamanho = scan.nextDouble();
		
		System.out.println("Infome a velocidade da internet em Mbps:");
		double velocidade = scan.nextDouble();
		
		double tempoEmSegundos = (tamanho * 8) / velocidade;
		System.out.println("O tempo aproximado de download é: " + tempoEmSegundos);
	}
}
