
public abstract class Poligono extends Figura {

	private int base;
	private int altura;
	

	
	
	
	
	public Poligono(int base, int altura) {
		setAltura(altura);
		setBase (base);

	}
	
	public abstract double perimetro();
	
public double area() {
		
		return getBase()*getAltura();
	}






	public int getBase() {
		return base;
	}





	public void setBase(int base) {
		this.base = base;
	}





	public int getAltura() {
		return altura;
	}





	public void setAltura(int altura) {
		this.altura = altura;
	}

}
