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
		return null;
	}

}
