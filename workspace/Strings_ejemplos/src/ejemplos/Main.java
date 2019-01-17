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

		int x = 15646;
		String num = x + "";

		String cadena1 = String.valueOf(x);


		String cad1 = "abcd";
		String cad2 = "e";

		// cad1 - cad2
		System.out.println(cad1.compareTo(cad2));
		// > 0 si cad1 > que cad2
		// < 0 si cad2 > que cad1

		if(cad1.compareTo(cad2) < 0)
		{
			System.out.println(cad1 + " va antes que " + cad2);
		}

		cad1.compareToIgnoreCase(cad2);

		System.out.println(cad1.toUpperCase());
		cad1 = cad1.toUpperCase();
		cad2 = cad2.toLowerCase();

		String cad3 = "Esta es una cadena cualquiera.";
		if(cad3.contains("cualquiera"))
		{
			System.out.println("contiene cualquiera");
		}
		System.out.println(cad3.indexOf("es"));

		cad3 = cad3.replaceAll("cadena", "frase");
		System.out.println(cad3);
		//cad3 = cad3.replace(" ", "");
		//System.out.println(cad3);

		String[] palabras = cad3.split(" ");
		for (int i = 0; i < palabras.length; i++)
		{
			System.out.println(palabras[i]);
		}

		String cad4 = "0123456789";
		System.out.println(cad4.substring(4));
		System.out.println(cad4.substring(4,8));


	}
}
