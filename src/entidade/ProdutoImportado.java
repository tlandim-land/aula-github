package entidade;

public class ProdutoImportado extends ProdutoNacional {
	
	private Double taxas;
	
	// construtores
	public ProdutoImportado() {
		super();
	}

	public ProdutoImportado(String nome, Double preco, Double taxas) {
		super(nome, preco);
		this.taxas = taxas;
	}

	// getters e setters
	public Double getTaxas() {
		return taxas;
	}

	public void setTaxas(Double taxas) {
		this.taxas = taxas;
	}
	
	// metodos da classe
	public Double precoTotal() {
		return getPreco() + taxas;
	}
	
	@Override
	public String etiqueta() {
		return getNome() + 
				" R$ " +
				String.format("%.2f", precoTotal()) + 
				" (Taxa Importação R$ " + 
				String.format("%.2f", taxas) +
				")";
	}
}
