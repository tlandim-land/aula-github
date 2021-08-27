package entidade;

public class Produto {

	private String nome;
	private double preco;
	private int quantidade;
	
	// construtor da classe - obriga que os parametros da classe produto sejam informados
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}
	public double valorEstoque() {
		return preco * quantidade;
	}
	
	public void adicionaProduto(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removeProduto(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	// toString - converte em STRING
	public String toString() {
		return "Produto: "	+ nome
				+ ", R$ " + String.format("%.2f", preco)
				+ ", estoque " + quantidade + " unidades "
				+ ", valor TOTAL R$ " + String.format("%.2f",valorEstoque());		
	}
}
