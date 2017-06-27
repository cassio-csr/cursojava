package aula13;

public class CurtoCircuito {

	public static void main(String[] args) {
		
		boolean verdadeiro = true;
		boolean falso = false;
		boolean resultado1 = falso & 
				verdadeiro;//verifica as variaveis uma após a outra
		boolean resultado2 = falso &&
				verdadeiro;//verifica as variaveis simuntaneamente
		System.out.println(resultado1);
		System.out.println(resultado2);

	}

}
