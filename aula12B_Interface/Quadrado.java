package aula12B_Interface;

public class Quadrado implements InterfaceGeometrica {

	private double base;
	private double altura;
	
	public Quadrado(double base, double altura) {	
		this.base = base;
		this.altura = altura;
	}

	public double area() {
		return (base*altura);
	}

	public double perimetro() {
		return base+base+base+base;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	


}
