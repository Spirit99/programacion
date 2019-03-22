package abstracta;

public class Main
{

	public static void main(String[] args)
	{
		// Forma forma = new Forma(null,1f,1f,0f,0f,null);
		Triangulo triangulo = new Triangulo("Triángulo", 10f, 5f, 5.6f, 44.2f, "#F3A");
		System.out.println("Area de " + triangulo.getNombre() + ": " + triangulo.calcularArea());

		Rectangulo rectagulo = new Rectangulo("Rectangulo", 10f, 5f, 5.6f, 44.2f, "#F3A");
		System.out.println("Area de " + rectagulo.getNombre() + ": " + rectagulo.calcularArea());

	}

}