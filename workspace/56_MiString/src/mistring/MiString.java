package mistring;

public class MiString
{
	private MiString()
	{

	}

	public static String alReves(String cadena)
	{
		String alReves = "";
		for (int i = cadena.length() - 1; i >= 0; i--)
		{
			alReves += cadena.charAt(i);
		}
		return alReves;
	}

	public static String limpiaCaracteres(String cad1, String cad2)
	{
		String limpio = "";
		for (int i = 0; i < cad1.length(); i++)
		{
			if(!seEncuentra(cad1.charAt(i), cad2))
			{
				limpio += cad1.charAt(i);
			}
		}
		return limpio;
	}

	private static boolean seEncuentra(char c, String cadena)
	{
		for (int i = 0; i < cadena.length(); i++)
		{
			if(c == cadena.charAt(i))
			{
				return true;
			}
		}
		return false;
	}


	public static String sustituye(String cadena, char cambiar, char sustituto)
	{
		StringBuilder nuevo = new StringBuilder();

		for (int i = 0; i < cadena.length(); i++)
		{
			if(cadena.charAt(i) == cambiar)
			{
				nuevo.append(sustituto);
			}
			else
			{
				nuevo.append(cadena.charAt(i));
			}
		}
		return nuevo.toString();
	}

	public static boolean todosIguales(String cadena)
	{
		return false;
	}

	public static String quitaEspacios(String cadena)
	{
		return null;
	}

	public static boolean esNumeroEntero(String cadena)
	{
		return false;
	}
}
