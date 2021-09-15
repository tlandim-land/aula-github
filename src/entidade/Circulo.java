package entidade;

import entidade.enums.Cor;

public class Circulo extends Forma {

	private Double raio;
	
	//construtores da classe
	public Circulo() {
		super();
	}

	public Circulo(Cor cor, Double raio) {
		super(cor);
		this.raio = raio;
	}

	//getters e setters 
	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	// metodos da classe
	@Override
	public Double area() {
		return Math.PI * raio *raio;
	}
}
