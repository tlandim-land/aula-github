package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Produto;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// entrada inicial de produtos
		System.out.println("Digite o novo PRODUTO: ");
		System.out.print("nome: ");
		String nome = sc.nextLine();
		
	    System.out.print("preço: ");
		double preco = sc.nextDouble();

		System.out.print("quantidade: ");
		int quantidade= sc.nextInt();
		
		Produto produto = new Produto(nome, preco, quantidade);
		
		produto.setNome("novo produto");
		
		System.out.println();
		System.out.print(produto.toString());
		System.out.println("produto atualizado: " + produto.getNome());
		
		// atualiza entrada de produtos estoque
		System.out.println();
		System.out.print("Adicione a quantidade de entrada estoque: ");
		quantidade = sc.nextInt();
		
		produto.adicionaProduto(quantidade); 		
		System.out.println();
		System.out.println(produto.toString());

		// atualiza saida de produtos estoque
		System.out.println();
		System.out.print("Adicione a quantidade de saida estoque: ");
		quantidade = sc.nextInt();
		
		produto.removeProduto(quantidade);
		System.out.println();
		System.out.println(produto.toString());
		
		sc.close();
	}
}
