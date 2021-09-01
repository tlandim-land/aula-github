package entidade;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entidade.enums.CargoTrabalhador;

public class Trabalhador {

	private String nome;
	private CargoTrabalhador cargo;
	private Double salarioBase;

	// associações da classe
	private Departamento departamento;
	private List<ContratoHora> contratos = new ArrayList<>();
	
	// construtores da classe
	public Trabalhador() {
		
	}

	public Trabalhador(String nome, CargoTrabalhador cargo, Double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.cargo = cargo;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}
	
	// getters e setters	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public CargoTrabalhador getCargo() {
		return cargo;
	}

	public void setCargo(CargoTrabalhador cargo) {
		this.cargo = cargo;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<ContratoHora> getContratos() {
		return contratos;
	}

	/* nao pode ser inserido via set, pois a lista de contrato sera 
	   tratada via metodos adiciona e remove
	    
	public void setContratos(List<ContratoHora> contratos) {
		this.contratos = contratos;
	} */
	
	// metodos da classe
	public void adicionaContrato(ContratoHora contrato) {
		contratos.add(contrato);
	}

	public void removeContrato(ContratoHora contrato) {
		contratos.remove(contrato);
	}
	
	public double renda(int mes, int ano) {
		double soma = salarioBase;
		Calendar cal = Calendar.getInstance();
		
		for(ContratoHora c : contratos) {
			cal.setTime(c.getData());
			
			int c_mes = 1 + cal.get(Calendar.MONTH);
			int c_ano = cal.get(Calendar.YEAR);;
			
			if (mes == c_mes && ano == c_ano) {
				soma += c.valorTotal();
			}
		}
		
		return soma;
	}
	
}
