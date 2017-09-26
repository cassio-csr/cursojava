package aula15labs;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o ano para verificação:");
		int ano = scan.nextInt();
		
		if((ano % 400 == 0) || ano % 4 == 0 && ano % 100 != 0) {
			System.out.println(ano + " é Bissexto!");
		}else {
			System.out.println(ano + " não é Bissexto!");
		}
		
		/************* Esta não foi uma boa forma ************
		if ((ano % 4) == 0) {
			if ((ano % 100) != 0) {
				System.out.println("Este ano é Bissexto!");
			} else if ((ano % 100) == 0 && (ano % 400) == 0){
				System.out.println("Este ano é Bissexto!");
			} else {
				System.out.println("Este ano não é Bissexto!");
			}			
		} else {
			System.out.println("Este ano não é Bissexto!");
		}
		*/
	}

}
