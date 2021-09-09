package entidade;

public class Poupança extends ContaNova{

	private Double taxaJuros;
	
	// construtores da classe
	public Poupança() {
		super();
	}

	public Poupança(Integer numero, String titular, Double saldoInicio, Double taxaJuros) {
		super(numero, titular, saldoInicio);
		this.taxaJuros = taxaJuros;
	}
	
	// getters e setters
	public Double getTaxaJuros() {
		return taxaJuros;
	}
	
	public void setTaxaJuro(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
	// metodos da classe
	public void atualizaSaldo() {
		saldo += saldo * taxaJuros;
	}
	
	@Override
	public void saque(double valor) {
		saldo -= valor;
	}
}
