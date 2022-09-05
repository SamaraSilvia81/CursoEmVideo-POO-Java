package aula03_metodosEspeciais;

public class Caneta {
	
	public String modelo;
	public String cor;
	private double ponta;
	private boolean tampada;
	
	// método construtor
	
	public Caneta () {
		this.destampar();
	}
	
	public Caneta (String m, String c, double p) {
		
		setModelo(m);
		setPonta(p);
		
		this.cor = c;
		this.tampar();
	}
	
	public Caneta (String m, String c, double p, boolean t) {
		
		setModelo(m);
		setPonta(p);
		
		this.cor = c;
		this.tampada = t;
	}
	
	// getters e setters de Modelo
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String m) {
		this.modelo = m;
	}
	
	// getters e setters de Ponta
	
	public double getPonta() {
		return this.ponta;
	}
	
	public void setPonta(double p) {
		this.ponta = p;
	}
	
	// métodos
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
	
	public boolean getDestampar() {
		return this.tampada; // chamo o atributo
	}
	
	
	// método de Status padrão para armazenar os "escrevas"
	
	public void status() {
		// System.out.println("SOBRE A CANETA");
		System.out.println("Modelo: " + this.getModelo()); // acesso com o método get.
		System.out.println("Ponta: " + this.ponta); // acesso direito
		System.out.println("Cor: " + this.cor);
		System.out.println("Tampada: " + this.tampada);
	}

}
