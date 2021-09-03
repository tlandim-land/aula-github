package entidade;

public class ItemPedido {
	
	private Integer quantidade;
	private Double preco;
	
	// associacao de classes
	private ProdutoNovo produto;
	
	// construtores da classe
	
	public ItemPedido() {
		
	}
	
	public ItemPedido(Integer quantidade, Double preco, ProdutoNovo produto) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}
	
	// getters e setters 
	
	public Integer getQuantidade( ) {
		return quantidade;
	}
	
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public Double getPreco() {
		return preco;
	}
	
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public ProdutoNovo getProduto() {
		return produto;
	}
	
	public void setProduto(ProdutoNovo produto) {
		this.produto = produto;
	}
	
	// metodos da classe
	public Double subTotal() {
		return preco * quantidade;
	}
	
	@Override
	public String toString() {
		return produto.getNome() 
				+ ", R$" 
				+ String.format("%.2f", preco) 
				+ ", Quantidade: " 
				+ quantidade + 
				", Subtotal: R$" 
				+ String.format("%.2f", subTotal());	
	}
}
