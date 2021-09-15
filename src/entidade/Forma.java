package entidade;

import entidade.enums.Cor;

public abstract class Forma {
	
	private Cor cor;
	
	// construtores da classe
	public Forma() {
	}
	
	public Forma(Cor cor) {
		this.cor = cor;
	}
	
	// getters e setters 
	public Cor getCor() {
		return cor;
	}
	
	public void setCor(Cor cor) {
		this.cor = cor;
	}
	
	//metodos da classe - abstrato
	public abstract Double area();
}
