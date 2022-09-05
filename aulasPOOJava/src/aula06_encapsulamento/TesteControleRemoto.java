package aula06_encapsulamento;

public class TesteControleRemoto {
	
	public static void main(String[] args) {
		
		ControleRemoto cr = new ControleRemoto();
		
		// Dispositivo Desligado 
		
		/* cr.desligar();
		
		cr.play();
		cr.pause();
		cr.maisVolume();
		cr.menosVolume();
		cr.ligarMudo();
		cr.desligarMudo();
		cr.abirMenu();
		cr.fecharMenu();
		
		*/
		
		// Dispositivo Ligado 
		
		cr.ligar();
		
		//cr.play();
		//cr.pause();
		//cr.maisVolume();
		//cr.menosVolume();
		//cr.ligarMudo();
		//cr.desligarMudo();
		
		cr.abirMenu();
		
		
		
		
	}
}
