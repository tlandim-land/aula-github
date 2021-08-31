package entidade;

import java.util.Date;

import entidade.enums.OrdemStatus;

public class Pedido {

	private int id;
	private Date data;
	private OrdemStatus status;
	
	// construtores da classe
	public Pedido(){
		
	}

	public Pedido(int id, Date data, OrdemStatus status) {
		this.id = id;
		this.data = data;
		this.status = status;
	}

	// getters e setters da classe
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public OrdemStatus getStatus() {
		return status;
	}

	public void setStatus(OrdemStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", data=" + data + ", status=" + status + "]";
	}
}
