package aula15labs;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira um n�mero inteiro:");
		int numero1 = scan.nextInt();
		
		System.out.println("Insira outro n�mero inteiro:");
		int numero2 = scan.nextInt();
		
		int resultado = 0;
		boolean valida = true;
		
		System.out.println("Qual opera��o voc� desja fazer?\n1>soma 2>Subtra��o "
				+"3>multiplica��o 4>divis�o");
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
			System.out.println("Opera��o inv�lida!");
			valida = false;
		}
		
		if(valida) {
			
			System.out.println("O resultado � " + resultado);
			
			if ((resultado % 2) == 0) {
				System.out.print("� um n�mero par ");
			} else {
				System.out.print("� um n�mero impar ");
			}
			
			if (resultado >= 0) {
				System.out.print("positivo");
			} else {
				System.out.print("negativo");
			}
		}			
	}

}
