package generica;

public class Main
{

	public static void main(String[] args)
	{

		ClaseGenerica<Integer> claseGenerica = new ClaseGenerica<>(4, 5);
		claseGenerica.intercambiaAB();
		System.out.println(claseGenerica.getA());
		System.out.println(claseGenerica.getB());
		System.out.println("Clase: " + claseGenerica.nombreClase());

		ClaseGenerica<String> claseGenerica2 = new ClaseGenerica<String>("uno", "dos");
		claseGenerica2.intercambiaAB();
		System.out.println(claseGenerica2.getA());
		System.out.println(claseGenerica2.getB());
		System.out.println("Clase: " + claseGenerica2.nombreClase());

	}

}
