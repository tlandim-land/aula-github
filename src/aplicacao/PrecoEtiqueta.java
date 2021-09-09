package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidade.ProdutoImportado;
import entidade.ProdutoNacional;
import entidade.ProdutoUsado;

public class PrecoEtiqueta {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<ProdutoNacional> list = new ArrayList<>();
		
		System.out.print("DIGITE A QUANTIDADE DE PRODUTOS: ");
		int qtd = sc.nextInt();
		
		for(int i = 0; i < qtd; i++) {
			System.out.print("PRODUTO <N>ACIONAL, <I> IMPORTADO OU (<U>SADO : ");
			char tipo = sc.next().charAt(0);
			
			System.out.print("NOME PRODUTO: ");
			String nome = sc.next();

			System.out.print("PREÇO PRODUTO: ");
			double preco = sc.nextDouble();

			if(tipo == 'N' || tipo == 'n') {
				list.add(new ProdutoNacional(nome, preco));
			} else {
				if(tipo == 'I' || tipo == 'i') {
					System.out.print("TAXA PRODUTO: ");
					double taxa = sc.nextDouble();

					list.add(new ProdutoImportado(nome, preco, taxa));
				} else {
					System.out.print("DATA FABRICACAO PRODUTO: ");
					Date fabricacao = sdf.parse(sc.next());	
					
					list.add(new ProdutoUsado(nome, preco, fabricacao));
				}
			}								
		}
		
		for (ProdutoNacional produto :  list) {
			System.out.println(produto.etiqueta());
		}
		
		sc.close();
	}

}
