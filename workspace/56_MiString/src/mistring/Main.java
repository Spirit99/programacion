package mistring;

public class Main
{

	public static void main(String[] args)
	{
		System.out.println(MiString.alReves("hola"));

		System.out.println(MiString.limpiaCaracteres("abecedario", "aeiou"));

		System.out.println(MiString.sustituye("buenas tardes", 'a', 'o'));

		System.out.println(MiString.esNumeroEntero("123123213123"));

		System.out.println(MiString.esNumeroEntero("123123X13123"));

		System.out.println(MiString.todosIguales("aaaaaaaaa"));

		System.out.println(MiString.todosIguales("aaaaaaaa1"));

		System.out.println(MiString.quitaEspacios("sin espacios en blanco"));
	}

}
