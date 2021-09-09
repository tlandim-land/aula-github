package entidade;

public class FuncionarioNovo {
	
	private String nome;
	private Integer horas;
	private Double valorHora;
	
	// construtores da classe
	public FuncionarioNovo() {
	}
	
	public FuncionarioNovo(String nome, Integer horas, Double valorHora) {
		this.nome = nome;
		this.horas = horas;
		this.valorHora = valorHora;
	}

	// getters e setters 
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Integer getHoras() {
		return horas;
	}
	
	public void setHoras(Integer horas) {
		this.horas = horas;
	}
	
	public Double getValorHora() {
		return valorHora;
	}
	
	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}
	
	// metodos da classe
	public double salario() {
		return horas * valorHora;
	}
}
