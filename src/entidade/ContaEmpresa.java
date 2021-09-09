package entidade;

public class ContaEmpresa extends ContaNova{

	private Double limiteEmprestimo;
	
	// construtores da classe
	public ContaEmpresa() {
		super();
	}

	public ContaEmpresa(Integer numero, String titular, Double saldoInicio, Double limiteEmprestimo) {
		super(numero, titular, saldoInicio);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public Double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(Double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}
	
	// metodos da classe
	public void emprestimo(double valor) {
		if(valor <= limiteEmprestimo) {
			//deposito(valor);
			saldo += valor - 10.0;
		}
	}
	
	@Override
	public void saque(double valor) {
		super.saque(valor);
		saldo -= 2.0;
	}
}
