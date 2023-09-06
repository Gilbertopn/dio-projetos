package conta_banco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 int numero;
		 String agencia;
		 String nomeCliente;
		 double saldo;
		
		 System.out.println("Por favor, digite o número da Agência !");
		 
		 System.out.print("Número: ");
		 numero = sc.nextInt();
		 
		 System.out.print("Agência: ");
		 agencia = sc.next();
		 
		 System.out.print("Nome do Cartão: ");
		 nomeCliente = sc.next();
		 
		 System.out.print("Saldo: ");
		 saldo = sc.nextDouble();
		 
		 System.out.print("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponivel para saque.");
		
		
		sc.close();
	}

}
