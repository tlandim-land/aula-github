package entidade;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidade.enums.StatusPedido;

public class PedidoNovo {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:SS");
	
	private Date dataPedido;
	
	// associacoes da classe
	
	private StatusPedido status;	
	private Cliente cliente;
	
	private List<ItemPedido> itens = new ArrayList<>();
	
	// construtores da classe
	
	public PedidoNovo() {
		
	}
	
	public PedidoNovo(Date dataPedido, StatusPedido status, Cliente cliente) {
		this.dataPedido = dataPedido;
		this.status = status;
		this.cliente = cliente;
	}
	
	// getters e setters
	
	public Date getDataPedido() {
		return dataPedido;
	}
	
	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}
	
	public StatusPedido getStatus() {
		return status;
	}
	
	public void setStatus(StatusPedido status) {
		this.status = status;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public List<ItemPedido> getItens() {
		return itens;
	}
	
	// metodos da classe
	public void adicionaItem(ItemPedido item) {
		itens.add(item);
	}
	
	public void removeItem(ItemPedido item) {
		itens.remove(item);
	}
	
	public double total() {
		double soma = 0.0;
		
		for (ItemPedido item : itens) {
			soma += item.subTotal();
		}
		
		return soma;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Data Pedido: ");
		sb.append(sdf.format(dataPedido) + "\n");
		sb.append("Status Pedido: ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(cliente + "\n");
		sb.append("Itens Pedido: \n");
		for (ItemPedido item : itens) {
			sb.append(item + "\n");
		}
		sb.append("Total Preço: R$");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}	
}
