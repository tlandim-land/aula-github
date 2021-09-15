package entidade;

import entidade.enums.Cor;

public class Retangulo extends Forma {
	
	private Double largura;
	private Double altura;
	
	//construtores da classe
	public Retangulo() {
		super();
	}

	public Retangulo(Cor cor, Double largura, Double altura) {
		super(cor);
		this.largura = largura;
		this.altura = altura;
	}
	
	// getters e setters
	public Double getLargura() {
		return largura;
	}

	public void setLargura(Double largura) {
		this.largura = largura;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	// metodos da classe
	@Override
	public Double area() {
		return largura * altura;
	}
}
