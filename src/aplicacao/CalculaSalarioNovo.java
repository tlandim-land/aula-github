package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidade.FuncionarioNovo;
import entidade.FuncionarioTerceiro;

public class CalculaSalarioNovo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<FuncionarioNovo> list = new ArrayList<>();
		
		System.out.print("DIGITE A QUANTIDADE DE FUNCIONARIOS: ");
		int qtd = sc.nextInt();
		
		for(int i = 0; i < qtd; i++) {
			System.out.print("FUNCIONARIO TERCEIRO <S / s> OU <N / n>: ");
			char tipo = sc.next().charAt(0);
					
			System.out.print("DIGITE O NOME DO FUNCIONARIO: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("DIGITE A QUANTIDADE DE HORAS DO FUNCIONARIO: ");
			int horas = sc.nextInt();
					
			System.out.print("DIGITE O VALOR HORA DO FUNCIONARIO: ");
			double valorHora = sc.nextDouble();
						
			if (tipo == 's' || tipo == 'S') {
				System.out.print("DIGITE O VALOR ADICIONAL DO FUNCIONARIO: ");
				double valorAdicional = sc.nextDouble();

				list.add(new FuncionarioTerceiro(nome, horas, valorHora, valorAdicional));
			} 
			else {
				list.add(new FuncionarioNovo(nome, horas, valorHora));				
			}
		}
		
		System.out.println("PAGAMENTOS FUNCIONARIOS");
		System.out.println("=======================");
		
		for (FuncionarioNovo funcionario : list) {
			System.out.println(funcionario.getNome() + " " + funcionario.salario());
		}
		
		sc.close();		
	}

}
