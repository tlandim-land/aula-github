package entidade;

public class Departamento {
	private String nome;
	
	// construtores da classe
	public Departamento() {
		
	}
	
	public Departamento(String nome) {
		this.nome = nome;
	}
	
	// getters e setters 
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;		
	}	
}
