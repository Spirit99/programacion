package ejemplos;

public class Main
{

	public static void main(String[] args)
	{
		String cadena = "hola";

		// Comparar
		System.out.println(cadena.equals("Hola")); // false
		System.out.println(cadena.equalsIgnoreCase("Hola")); // true
		System.out.println(cadena.length()); // 4
		System.out.println(cadena.charAt(0)); // h

		for (int i = 0; i < cadena.length(); i++)
		{
			System.out.println(cadena.charAt(i));
		}
	}
}
