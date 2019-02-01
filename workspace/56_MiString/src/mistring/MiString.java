package mistring;

public class MiString
{
	private MiString()
	{

	}

	public static String alReves(String cadena)
	{
		StringBuilder alReves = new StringBuilder();
		for (int i = cadena.length() - 1; i >= 0; i--)
		{
			alReves.append(cadena.charAt(i));
		}
		return alReves.toString();
	}

	public static String limpiaCaracteres(String cad1, String cad2)
	{
		StringBuilder limpio = new StringBuilder();
		for (int i = 0; i < cad1.length(); i++)
		{
			if(!seEncuentra(cad1.charAt(i), cad2))
			{
				limpio.append(cad1.charAt(i));
			}
		}
		return limpio.toString();
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
		for (int i = 1; i < cadena.length(); i++)
		{
			if(cadena.charAt(0) != cadena.charAt(i))
			{
				return false;
			}
		}
		return true;
	}

	public static String quitaEspacios(String cadena)
	{
		return limpiaCaracteres(cadena, " ");
	}

	public static boolean esNumeroEntero(String cadena)
	{
		for (int i = 0; i < cadena.length(); i++)
		{
			if(cadena.charAt(i) < '0' || cadena.charAt(i) > '9')
			{
				return false;
			}
		}
		return true;
	}
}
