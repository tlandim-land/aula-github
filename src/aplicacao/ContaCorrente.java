package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Conta;

public class ContaCorrente {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.print("Digite o nome do titular da conta: ");
		String nome = sc.nextLine();
		
		System.out.print("Digite o numero da conta: ");
		int numeroConta = sc.nextInt();

		char x;
		double saldoConta;

		System.out.print("Deseja realizar deposito inicial: ");
		x = sc.next().charAt(0);
		
		if (x == 's' || x == 'S') {
			System.out.print("Digite o valor do deposito: ");
			saldoConta = sc.nextDouble();
			conta = new Conta(nome, numeroConta, saldoConta);
		} else {
			saldoConta = 0.00;
			conta = new Conta(nome, numeroConta);
		}
		
		System.out.println();
		System.out.println(conta);
		System.out.println();

		System.out.print("Deseja realizar deposito: ");
		x = sc.next().charAt(0);
		
		if (x == 's' || x == 'S') {
			System.out.print("Digite o valor do deposito: ");
			saldoConta = sc.nextDouble();
			conta.deposito(saldoConta);
		} else {
			saldoConta = 0.00;
		}
		
		System.out.println();
		System.out.println(conta);
		System.out.println();

		System.out.print("Deseja realizar saque: ");
		x = sc.next().charAt(0);
		
		if (x == 's' || x == 'S') {
			System.out.print("Digite o valor do saque: ");
			saldoConta = sc.nextDouble();
			conta.saque(saldoConta);
		} else {
			saldoConta = 0.00;
		}
		
		System.out.println();
		System.out.println(conta);
		System.out.println();
		
		sc.close();
	}
}
