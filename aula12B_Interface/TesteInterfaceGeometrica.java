package aula12B_Interface;

public class TesteInterfaceGeometrica {
	
public static void main(String[] args) {
		
		Quadrado squad = new Quadrado(3,4);
		
		System.out.println("Área do Quadrado: " + squad.area());
		System.out.println("Perímetro do Quadrado: " + squad.perimetro());

	}
}
