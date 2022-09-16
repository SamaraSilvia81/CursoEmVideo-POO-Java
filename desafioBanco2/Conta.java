package desafioBanco2;

public class Conta {

	public int numConta;
	protected String tipo; // poupança (cp) ou corrente (cc)
	private String nomeDono;
	private double saldo;
	public double taxaMensal;
	private boolean status; // conta aberta (true) ou fechada (false)

	// getters e setters

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public String setTipo(String tipo) {
		return this.tipo = tipo;
	}

	public String getNomeDono() {
		return nomeDono;
	}

	public void setNomeDono(String nomeDono) {
		this.nomeDono = nomeDono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getTaxaMensal() {
		return taxaMensal;
	}

	public double setTaxaMensal(double taxaMensal) {
		return this.taxaMensal = taxaMensal;
	}

	public boolean getStatus() {
		return status;
	}

	public boolean setStatus(boolean status) {
		return this.status = status;
	}

	// método construtor

	public void Conta() {
		this.saldo = 0;
		this.status = false;
	}

	// métodos

	public boolean abrirConta(String tipoConta) {

		this.tipo = tipoConta;

		if ("cc".equals(tipoConta)) {
			this.saldo = saldo + 50;
		} else if ("cp".equals(tipoConta)) {
			this.saldo = saldo + 150;
		}

		return this.status = true;
	}

	public void fecharConta(boolean debito) {

		// this.sacar(); // é preciso sacar para zerar a conta

		if (saldo == 0 && debito == false) {
			this.status = false;
		} else {
			System.out.println("ERRO! Você não cumpre os critérios para o fechamento da conta.");
		}
	}

	public void depositar(double deposito) {
		this.saldo = this.saldo + deposito;
	}

	public void sacar(double saque) {
		this.saldo -= saque; // não precisava setar, porque o saldo já está nessa classe.
	}

	public void pagarMensal(String tipoConta) {

		if (tipoConta == "cc") {
			this.taxaMensal = 12;
			this.saldo = saldo - 12;
		} else if (tipoConta == "cp") {
			this.taxaMensal = 20;
			this.saldo = saldo - 20;
		}
	}

}
