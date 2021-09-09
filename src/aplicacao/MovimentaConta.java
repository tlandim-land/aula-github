package aplicacao;

import entidade.ContaEmpresa;
import entidade.ContaNova;
import entidade.Poupança;

public class MovimentaConta {

	public static void main(String[] args) {
		/*
		ContaNova conta = new ContaNova(1001, "THIAGO", 0.0);
		
		ContaEmpresa contaEmpresa = new ContaEmpresa(1002, "RAYANA", 0.0, 500.0);
		
		// UPCASTING
		ContaNova conta1 = contaEmpresa;
		
		ContaNova conta2 = new ContaEmpresa(1003, "JOÃO",0.0, 200.0);
		
		ContaNova conta3 = new Poupança(1004, "MARIA", 0.0, 0.02);
		
		// DONWCASTING
		
		ContaEmpresa conta4 = (ContaEmpresa) conta2;
		conta4.emprestimo(10.0);
		
		//ContaEmpresa conta5 = (ContaEmpresa) conta3;
		if (conta3 instanceof ContaEmpresa) {
			ContaEmpresa conta5 = (ContaEmpresa) conta3;
			conta5.emprestimo(200.0);
			System.out.println("emprestimo realizado!");
		}
		
		if (conta3 instanceof Poupança) {
			Poupança conta5 = (Poupança) conta3;
			conta5.atualizaSaldo();
			System.out.println("saldo atualizado!");
		}
		*/
		
		/*
		ContaNova corrente = new ContaNova(1001, "THIAGO", 1000.0);
		corrente.saque(200.0); 
		
		System.out.println("saldo conta corrente: " + corrente.getSaldo());
		
		Poupança poupanca = new Poupança(1002, "THIAGO POUPANÇA", 1000.0, 0.5);
		poupanca.saque(200.0); 
		
		System.out.println("saldo conta poupança: " + poupanca.getSaldo());
		
		ContaEmpresa empresa = new ContaEmpresa(1003, "THIAGO EMPRESA", 1000.0, 500.0);
		empresa.saque(200.0);
		
		System.out.println("saldo conta empresa: " + empresa.getSaldo());
		*/
		
		
		// polimorfismo
		ContaNova corrente = new ContaNova(1000, "thiago conta", 1000.0);
		ContaNova poupança = new Poupança(1001, "thiago poupança", 1000.0, 0.1);
		ContaNova empresa = new ContaEmpresa(1002, "thiago empresa", 1000.0, 500.0);
		
		corrente.saque(50.0);
		poupança.saque(50.0);
		empresa.saque(50.0);
		
		System.out.println("corrente " + corrente.getSaldo());
		System.out.println("poupança " + poupança.getSaldo());
		System.out.println("empresa " + empresa.getSaldo());
	}	
}
