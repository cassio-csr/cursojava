package aula15labs;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira um número inteiro:");
		int numero1 = scan.nextInt();
		
		System.out.println("Insira outro número inteiro:");
		int numero2 = scan.nextInt();
		
		int resultado = 0;
		boolean valida = true;
		
		System.out.println("Qual operação você desja fazer?\n1>soma 2>Subtração "
				+"3>multiplicação 4>divisão");
		int operacao = scan.nextInt();
		
		switch (operacao) {
		case 1:
			resultado = numero1 + numero2;
		break;
		case 2:
			resultado = numero1 - numero2;
		break;
		case 3:
			resultado = numero1 * numero2;
		break;
		case 4:
			resultado = numero1 / numero2;
		break;
		default:
			System.out.println("Operação inválida!");
			valida = false;
		}
		
		if(valida) {
			
			System.out.println("O resultado é " + resultado);
			
			if ((resultado % 2) == 0) {
				System.out.print("É um número par ");
			} else {
				System.out.print("É um número impar ");
			}
			
			if (resultado >= 0) {
				System.out.print("positivo");
			} else {
				System.out.print("negativo");
			}
		}			
	}

}
