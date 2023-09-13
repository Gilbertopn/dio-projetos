package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

	public static void main(String[] args) {
		
		selecionarCandidato();

	}
	
		static void imprimirSelecionados() {
			String [] candidatos = {"FELIPE", "MARCIA", "JULIA","PAULO", "AUGUSTO"};
			System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

			for(int indice=0; indice< candidatos.length; indice++) {
					System.out.println("O candidato de n° " + indice + " é " + candidatos[indice]);
			}
		System.out.println("Forma abreviada de interaçãp for each");
		
			for(String candidato: candidatos) {
				System.out.println("O candidato Selecionado foi " + candidato);
			}
		}
	
		static void selecionarCandidato() {
			String [] candidatos = {"FELIPE", "MARCIA", "JULIA","PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA,", "DANIELA"};
			
			int candidatosSelecionados = 0;
			int candidatosAtual = 0;
			double salarioBase = 2000.0;
			while(candidatosSelecionados <5 && candidatosAtual < candidatos.length) {
				String candidato = candidatos[candidatosAtual];
				double salarioPretendido = valorPretendido();
				 
				System.out.println("O candidato"+ candidato + "Solicitou este valor de Salário" + salarioPretendido);
				if(salarioBase >= salarioPretendido) {
					System.out.println("O candidato"+ candidato + "foi slecionado para vaga");
					candidatosSelecionados++;
				}
			candidatosAtual++;
			}
		
		}
		
		static double valorPretendido() {
				return ThreadLocalRandom.current().nextDouble(1800, 2200);
			}
	
		static void analisarCandidato(double salarioPretendido) {
			double salarioBase = 2000.0;
			if(salarioBase > salarioPretendido) {
				System.out.println("LIGAR PARA O CANDIDATO");
			}else if(salarioBase == salarioPretendido) {
				System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
			}else {
				System.out.println("AGUARDANDO DEMAIS CANDIDATOS");
			}
			
				
	}
}


