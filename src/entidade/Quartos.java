package entidade;

public class Quartos {
	
	private String nome;
	private String email;
	private int quarto;
	
	public Quartos(String nome, String email, int quarto) {
		this.nome = nome;
		this.email = email;
		this.quarto = quarto;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setQuarto(int quarto) {
		this.quarto = quarto;
	}
	
	public int getQuarto() {
		return quarto;
	}
	
	public String toString() {
		return "NOME LOCATARIO : " + nome + " | " + 
			   "EMAIL LOCATARIO: " + email + " | " + 
			   "NUMERO QUARTO..: " + quarto;
	}
}
