package desafio_controle_de_fluxo;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int parametroUm;
		int parametroDois;
		
		System.out.println("Digite o primeiro parâmetro");
		parametroUm = sc.nextInt();
		System.out.println("Digite o segundo parâmetro");
		parametroDois = sc.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
 			System.out.println("O segundo parâmetro deve ser maior que o primeiro"); 
		}
		
		sc.close();
	}
	
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {

		if(parametroUm > parametroDois) {
			throw new ParametrosInvalidosException();
		}
		
		int contagem = parametroDois - parametroUm;
		for (int numero = 1; numero<= contagem; numero++ ) {
			System.out.println("Imprimindo número: " + numero);
			
		}		
	}
}
