package aula15labs;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite F para feminino ou M para masculino:");
		String sexo = scan.next();
		
		if (sexo.equalsIgnoreCase("m")) {
			System.out.println("M - Masculino");
		} else if (sexo.equalsIgnoreCase("f")) {
			System.out.println("F - Feminino");
		} else {
			System.out.println("Sexo inválido!");
		}
	}

}
