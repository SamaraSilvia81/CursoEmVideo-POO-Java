package aula06_encapsulamento;

public interface Controlador {
	
	// Métodos Abstratos
	
	public abstract void ligar(); // abstrato não abre bloco 
	public abstract void desligar(); // atribua o tipo de retorno da função
	public abstract void abirMenu();
	public abstract void fecharMenu();
	public abstract void maisVolume();
	public abstract void menosVolume();
	public abstract void ligarMudo();
	public abstract void desligarMudo();
	public abstract void play();
	public abstract void pause();
	
} 
