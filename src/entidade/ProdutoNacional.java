package entidade;

public class ProdutoNacional {

	private String nome;
	private Double preco;
	
	// construtores da classe;
	public ProdutoNacional() {
	}
	
	public ProdutoNacional(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	// getters e setter
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
	
	// metodos da classe
	public String etiqueta() {
		return nome + " R$ " + String.format("%.2f", preco);
	}
}
