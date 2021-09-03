package entidade;

public class ProdutoNovo {

	private String nome;
	private Double preco;
	
	// construtores da classe
	public ProdutoNovo() {
		
	}
	
	public ProdutoNovo(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	// getters e setters
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Double getPreco() {
		return preco;
	}
	
	public void setPreco(Double preco) {
		this.preco = preco;
	}	
}
