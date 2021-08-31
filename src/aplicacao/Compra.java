package aplicacao;

import java.util.Date;

import entidade.Pedido;
import entidade.enums.OrdemStatus;

public class Compra {

	public static void main(String[] args) {
		
		OrdemStatus os = OrdemStatus.valueOf("PAGAMENTO_PENDENTE");
		
		Pedido pedido = new Pedido(10, new Date(), OrdemStatus.PAGAMENTO_PENDENTE);
		
		System.out.println(pedido);
		
		System.out.println(os);

	}

}
