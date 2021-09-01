package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidade.ContratoHora;
import entidade.Departamento;
import entidade.Trabalhador;
import entidade.enums.CargoTrabalhador;

public class CalculaSalario {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// definição de mascara de data
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM/yyyy");		
		
		// informações do departamento
		System.out.print("Entre com nome do departamento: ");
		String nomeDepartamento = sc.nextLine();
		
		System.out.println();
		
		// informações do trabalhador
		System.out.println("Entre com os dados do Trabalhador");
		System.out.print("Entre com nome do trabalhador: ");
		String nomeTrabalhador = sc.nextLine();
		System.out.print("Entre com cargo do trabalhador: ");
		String cargoTrabalhador = sc.nextLine();
		System.out.print("Entre com salario base do trabalhador: ");
		double salarioTrabalhador = sc.nextDouble();
		
		Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, CargoTrabalhador.valueOf(cargoTrabalhador), salarioTrabalhador, new Departamento(nomeDepartamento));
		
		System.out.println();
		
		// informações do contrato trabalhador		
		System.out.println("Entre com os dados dos contratos do Trabalhador");
		System.out.print("quantos contratos tem o trabalhador: ");
		int contratosTrabalhador = sc.nextInt();
		
		for (int i = 1; i <= contratosTrabalhador; i ++) {
			System.out.println("Entre com os dados do contratos " + i + " : " );
		
			System.out.print("data (DD/MM/AAAA) : ");
			Date dataContrato = sdf.parse(sc.next());
			System.out.print("valor por hora : ");
			double valorHora = sc.nextDouble();
			System.out.print("duração contrato : ");
			int horas = sc.nextInt();
			
			ContratoHora contrato = new ContratoHora(dataContrato, valorHora, horas);
			trabalhador.adicionaContrato(contrato);
		}
		
		System.out.println();
		
		// informações do salario a receber trabalhador
		System.out.print("Entre com mes e ano para calculo do salario Trabalhador (MM/AAAA) : ");
		String mesEAno = sc.next();
		int mes = Integer.parseInt(mesEAno.substring(0,2));
		int ano = Integer.parseInt(mesEAno.substring(3,7));

		System.out.println();
		
		System.out.println("NOME : " + trabalhador.getNome());
		System.out.println("DEPARTAMENTO : " + trabalhador.getDepartamento().getNome());
		System.out.println("VALOR RENDA " + mesEAno + " " + String.format("%.2f", trabalhador.renda(mes, ano)));
		
		sc.close();

	}

}
