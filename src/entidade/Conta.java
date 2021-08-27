package entidade;

public class Conta {

		private String nome;
		private int numeroConta;
		private double saldoConta;
		
		// construtores da classe conta
		public Conta(String nome, int numeroConta, double saldoInicial) {
			this.nome = nome;
			this.numeroConta = numeroConta;
			deposito(saldoInicial);
		}
		
		public Conta(String nome, int numeroConta) {
			this.nome = nome;
			this.numeroConta = numeroConta;
		}
		
		// getters and setters
		public String getNome() {
			return nome;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public int getNumeroConta() {
			return numeroConta;
		}
		
		public double getSaldoConta() {
			return saldoConta;
		}

		// metodos da classe
		public void deposito(double valorDeposito) {
			saldoConta += valorDeposito;
		}
			
		public void saque(double valorSaque) {
			double taxa = 5.00;
			saldoConta -= valorSaque + taxa;
		}
		
		public String toString() {
			return "TITULAR CONTA : " + nome + " | " + 
					"NUMERO CONTA : " + numeroConta + " | " + 
					"SALDO CONTA  : " + 
					String.format("%.2f", saldoConta);
		}
}
