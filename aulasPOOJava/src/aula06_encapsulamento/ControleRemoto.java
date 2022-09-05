package aula06_encapsulamento;

public class ControleRemoto implements Controlador {
	
	// Atributos
	
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	// Construtor
	
	public ControleRemoto() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}
	
	// Métodos Especiais
	
	private int getVolume() {
		return volume;
	}
	
	private void setVolume(int volume) {
		this.volume = volume;
	}
	
	private boolean getLigado() { // quando é boolean o sistema coloca "is". Por padrão coloque "get".
		return ligado;
	}
	
	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	private boolean getTocando() {
		return tocando;
	}
	
	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	

	// Sobrescrevendo (OVERRIDE) Métodos Abstrados

	@Override
	public void ligar() {
		this.setLigado(true);
	}

	@Override
	public void desligar() {
		this.setLigado(false);
	}

	@Override
	public void abirMenu() {
		
		if(this.getLigado()) {
			
			System.out.println("----- MENU -----");
			System.out.println("Está ligado? " + this.getLigado());	
			System.out.println("Está tocando? " + this.getTocando());	
			System.out.print("Volume: " + this.getVolume());
			
			for(int i = 0; i<= this.getVolume(); i+=10) {
				System.out.print(" " + "|");
			}
		} else {
			System.out.println("Impossível de abrir menu! Ligar dispositivo.");
		}
	}

	@Override
	public void fecharMenu() {
		
		if(this.getLigado()) {
			System.out.println("\nFechando Menu...");
		}else {
			System.out.println("Impossível de fechar menu! Ligar dispositivo.");
		}
	}

	@Override
	public void maisVolume() {
		
		if(this.getLigado()) {
			this.setVolume(this.getVolume() + 5);
		}else {
			System.out.println("Impossível de aumentar volume! Ligar dispositivo.");
		}
		
	}

	@Override
	public void menosVolume() {
		
		if(this.getLigado()) {
			this.setVolume(this.getVolume() - 5);
		}else {
			System.out.println("Impossível diminuir volume! Ligar dispositivo.");
		}
	}

	@Override
	public void ligarMudo() {
		
		if(this.getLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}else if (!this.getLigado()) {
			System.out.println("Impossível mutar! Ligar dispositivo.");
		} else {
			System.out.println("Impossível mutar! Já está mudo.");
		}
	}

	@Override
	public void desligarMudo() {
		
		if(this.getLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}else if (!this.getLigado()) {
			System.out.println("Impossível ativar som! Ligar dispositivo.");
		} else {
			System.out.println("Impossível ativar som! O som Já está ativado.");
		}
	}

	@Override
	public void play() {
		
		if(this.getLigado() && !(this.getTocando())) {
			this.setTocando(true);
		}else if (!this.getLigado()) {
			System.out.println("Impossível reproduzir! Ligar dispositivo.");
		} else {
			System.out.println("Impossível reproduzir! Já está tocando.");
		}

	}

	@Override
	public void pause() {
		
		if(this.getLigado() && this.getTocando()) {
			this.setTocando(false);
		}else if (!this.getLigado()) {
			System.out.println("Impossível pausar! Ligar dispositivo.");
		} else {
			System.out.println("Impossível pausar! Já está pausado.");
		}
	}
	
	
}
