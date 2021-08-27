package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.ProdutoVetor;

public class Vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/* vetor - tipo valor
		System.out.print("digite a quantidade de pessoas: ");
		int qtd = sc.nextInt();

		double[] vect = new double[qtd];
		
		// monta vetor
		for (int i = 0; i < qtd; i++) {
			System.out.print("digite a altura da pessoa: "); 
			vect[i] = sc.nextDouble();
		}
	
		// soma valores guardados no vetor
		double soma = 0.00;
		
		for (int i = 0; i < qtd; i++) {
			soma += vect[i];
		}
		
		double media = soma / qtd;
		
		System.out.print("media da altura das pessoas: " + media); 
		*/
		
		// vetor - tipo referencia
		System.out.print("digite a quantidade de produtos: ");
		int qtd = sc.nextInt();

		ProdutoVetor[] vect = new ProdutoVetor[qtd]; 

		// monta vetor
		for (int i = 0; i < vect.length; i++) {
			System.out.print("digite o nome do produto: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("digite o preco do produto: ");			
			double preco = sc.nextDouble();
			
			vect[i] = new ProdutoVetor(nome, preco);					
		}
			
		// soma valores guardados no vetor
		double soma = 0.00;
		
		for (int i = 0; i < vect.length; i++) {
			soma += vect[i].getPreco();
		}
		
		double media = soma / qtd;
		
		System.out.print("media do preco dos produtos: " + media); 
		
		sc.close();
	}
}
