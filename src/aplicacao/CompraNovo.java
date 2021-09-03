package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidade.Cliente;
import entidade.ItemPedido;
import entidade.PedidoNovo;
import entidade.ProdutoNovo;
import entidade.enums.StatusPedido;



public class CompraNovo {

	public static void main(String[] args) throws ParseException {
			
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Entre com os Dados do Cliente: ");
		
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Email: ");
		String email = sc.next();
		
		System.out.print("Data Nascimento (DD/MM/YYYY): ");
		Date nascimento = sdf.parse(sc.next());
			
		Cliente cliente = new Cliente(nome, email, nascimento);
			
		System.out.println("Entre com os Dados do Pedido:");
		
		System.out.print("Status: ");
		StatusPedido status = StatusPedido.valueOf(sc.next());
			
		PedidoNovo pedido = new PedidoNovo(new Date(), status, cliente);
		

		System.out.print("Quantos itens serão incluidos neste pedido? ");
		
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Entre #" + i + " dados do item:");
		
			System.out.print("Nome Produto: ");
			sc.nextLine();
			String nomeProduto = sc.nextLine();
			
			System.out.print("Preço Produto: ");
			double precoProduto = sc.nextDouble();

			ProdutoNovo produto = new ProdutoNovo(nomeProduto, precoProduto);

			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();

			ItemPedido itemPedido = new ItemPedido(quantidade, precoProduto, produto); 

		    pedido.adicionaItem(itemPedido);
			}
			
			System.out.println();
			System.out.println("RESUMO DO PEDIDO:");
			System.out.println(pedido);
			
			sc.close();
		}
}
