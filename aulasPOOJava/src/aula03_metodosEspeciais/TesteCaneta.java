package aula03_metodosEspeciais;

public class TesteCaneta {
	
	public static void main(String[] args) {
		
		Caneta c1 = new Caneta();
		
		c1.setModelo("BIC Cristal"); // usando método modificador
		c1.modelo = "BIC Cristal"; // acesso direto
		c1.setPonta(0.2);
		
		// c1.ponta = 0.5; // tem acesso privado
		// c1.status();
		
		System.out.println("#Teste 1 de Caneta" + "\nTenho uma caneta " + c1.getModelo() 
		+ " de ponta " + c1.getPonta() + " que tem sua tampa " + c1.getDestampar());
		
		
		// Usando método construtor
		
		Caneta c2 = new Caneta("NIC", "Vermelha", 0.4);
		System.out.println("\n#Teste 2 de Caneta");
		c2.status();
		
		Caneta c3 = new Caneta("Marvel", "Preto", 0.7, false);
		System.out.println("\n#Teste 3 de Caneta");
		c3.status();
		
	
	}

}
