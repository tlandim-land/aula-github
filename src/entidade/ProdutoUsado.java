package entidade;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends ProdutoNacional {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date fabricacao;
	
	//construtores da classe
	public ProdutoUsado() {
		super();
	}

	public ProdutoUsado(String nome, Double preco, Date fabricacao) {
		super(nome, preco);
		this.fabricacao = fabricacao;
	}

	//getters e setters
	public Date getFabricacao() {
		return fabricacao;
	}

	public void setFabricacao(Date fabricacao) {
		this.fabricacao = fabricacao;
	}
	
	// metodos da classe
	@Override 
	public String etiqueta() {
		return getNome() + 
				" (usado) R$ " +
				String.format("%.2f", getPreco()) + 
				" (Data Fabricação: " + 
				sdf.format(fabricacao) + 
				")";
	}
	
}
