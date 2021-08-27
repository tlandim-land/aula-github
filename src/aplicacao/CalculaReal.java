package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import utilitarios.ConverteMoeda;

public class CalculaReal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do Dolar: ");
		double valorMoeda = sc.nextDouble(); 
				
		System.out.println("Quantos dolares vai comprar: ");
		double totalCompra = sc.nextDouble(); 

		double semImposto = ConverteMoeda.dolarReal(valorMoeda, totalCompra);
		System.out.printf("Segue valor em reais a pagar sem imposto: %.2f%n", semImposto);
		
		double comImposto = ConverteMoeda.dolarRealImposto(valorMoeda, totalCompra); 
		System.out.printf("Segue valor em reais a pagar com imposto: %.2f%n", comImposto);
		
		sc.close();
	}

}
