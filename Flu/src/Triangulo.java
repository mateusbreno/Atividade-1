
public class Triangulo extends Poligono {

	public Triangulo(int base, int altura) {
		super(base, altura);
		
	}


	public double area() {
		
		return super.area()/2;
	}


	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}

}
