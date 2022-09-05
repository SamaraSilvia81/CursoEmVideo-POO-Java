package aula04_visibilidade;

public class TesteCaneta2 {
	
	public static void main(String[] args) {
		
		Caneta2 c1 = new Caneta2();
		
		c1.modelo = "BIC Cristal";
		c1.cor = "Verde";
		// c1.ponta = 0.5 ; // private
		c1.carga = 80;
		// c1.tampada = false;
		c1.destampar(); // embora o atributo seja privado o método que me dá acesso a ele é público, por isso funciona. O inverso tbm ocorre.
		c1.rabiscar();
		c1.status();
		
		
	}
}
