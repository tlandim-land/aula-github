package aplicacao;

import java.util.ArrayList;
import java.util.List;

import entidade.ContaEmpresa;
import entidade.ContaNova;
import entidade.Poupan�a;

public class MovimentaConta {

	public static void main(String[] args) {
		/*
		ContaNova conta = new ContaNova(1001, "THIAGO", 0.0);
		
		ContaEmpresa contaEmpresa = new ContaEmpresa(1002, "RAYANA", 0.0, 500.0);
		
		// UPCASTING
		ContaNova conta1 = contaEmpresa;
		
		ContaNova conta2 = new ContaEmpresa(1003, "JO�O",0.0, 200.0);
		
		ContaNova conta3 = new Poupan�a(1004, "MARIA", 0.0, 0.02);
		
		// DONWCASTING
		
		ContaEmpresa conta4 = (ContaEmpresa) conta2;
		conta4.emprestimo(10.0);
		
		//ContaEmpresa conta5 = (ContaEmpresa) conta3;
		if (conta3 instanceof ContaEmpresa) {
			ContaEmpresa conta5 = (ContaEmpresa) conta3;
			conta5.emprestimo(200.0);
			System.out.println("emprestimo realizado!");
		}
		
		if (conta3 instanceof Poupan�a) {
			Poupan�a conta5 = (Poupan�a) conta3;
			conta5.atualizaSaldo();
			System.out.println("saldo atualizado!");
		}
		*/
		
		/*
		ContaNova corrente = new ContaNova(1001, "THIAGO", 1000.0);
		corrente.saque(200.0); 
		
		System.out.println("saldo conta corrente: " + corrente.getSaldo());
		
		Poupan�a poupanca = new Poupan�a(1002, "THIAGO POUPAN�A", 1000.0, 0.5);
		poupanca.saque(200.0); 
		
		System.out.println("saldo conta poupan�a: " + poupanca.getSaldo());
		
		ContaEmpresa empresa = new ContaEmpresa(1003, "THIAGO EMPRESA", 1000.0, 500.0);
		empresa.saque(200.0);
		
		System.out.println("saldo conta empresa: " + empresa.getSaldo());
		*/
		
		/*
		// polimorfismo e classe abstrata
		
		// classe abstrata n�o deixa instanciar a classe abstrata
		ContaNova corrente = new ContaNova(1000, "thiago conta", 1000.0);
		ContaNova poupan�a = new Poupan�a(1001, "thiago poupan�a", 1000.0, 0.1);
		ContaNova empresa = new ContaEmpresa(1002, "thiago empresa", 1000.0, 500.0);
		
		corrente.saque(50.0);
		poupan�a.saque(50.0);
		empresa.saque(50.0);
		
		System.out.println("corrente " + corrente.getSaldo());
		System.out.println("poupan�a " + poupan�a.getSaldo());
		System.out.println("empresa " + empresa.getSaldo());
		*/
		
		List<ContaNova> list = new ArrayList<>();
		
		//upcasting
		
		list.add(new Poupan�a(1001, "Alex", 500.00, 0.01));
		list.add(new ContaEmpresa(1002, "Alex Empresa", 1000.00, 400.00));
		list.add(new Poupan�a(1003, "Bob", 300.00, 0.01));
		list.add(new Poupan�a(1004, "Bob Empresa", 500.00, 500.00));
		
		double soma = 0.00;
		
		for(ContaNova conta:list) {
			soma += conta.getSaldo();
		}
		
		System.out.println("saldo total todas as contas: " + soma);
		
		for(ContaNova conta:list) {
			conta.deposito(10.00);
		}
		
		for(ContaNova conta:list) {
			System.out.println("saldo total todas contas p�s deposito: " + conta.getNumero() + " " + conta.getSaldo());
		}
	}	
}
