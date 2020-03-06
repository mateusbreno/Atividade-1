import java.util.ArrayList;

public class Geometria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		ArrayList<Poligono> figuras = new ArrayList<>();
		  
		  
		  figuras.add(new Losango(3,3));
		  figuras.add(new Retangulo(5,3));
		  figuras.add(new Quadrado(2));
		  figuras.add(new Triangulo(3,2));
		
		  for(Poligono Losango: figuras) {
			    System.out.println(Losango.area() + ", " + Losango.perimetro());
			}
		
		  
		
		
	}

}
