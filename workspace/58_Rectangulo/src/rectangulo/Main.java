package rectangulo;

public class Main
{

	public static void main(String[] args)
	{
		Rectangulo rectangulo = new Rectangulo();
		rectangulo.agranda();
		System.out.println(rectangulo.getArea());

		rectangulo.agranda(10);
		rectangulo.agranda(1,4);
		System.out.println(rectangulo.getArea());
	}

}
