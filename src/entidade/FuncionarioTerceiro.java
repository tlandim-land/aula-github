package entidade;

public class FuncionarioTerceiro extends FuncionarioNovo {
	
	private Double valorAdicional;
	
	//construtores da classe
	public FuncionarioTerceiro() {
		super();
	}

	public FuncionarioTerceiro(String nome, Integer horas, Double valorHora, Double valorAdicional) {
		super(nome, horas, valorHora);
		this.valorAdicional = valorAdicional;
	}

	// getters e setters 
	public Double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(Double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
	// metodos da classe
	@Override
	public double salario() {
		return super.salario() + valorAdicional * 1.1;
	}
}
