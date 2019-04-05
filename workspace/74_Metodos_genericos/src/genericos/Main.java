package genericos;

public class Main
{

	public static void main(String[] args)
	{
		Integer[] numeros = {1,2,3,4,5,6,7,8,9};
		String[] cadenas = {"uno", "dos", "tres", "cuatro", "cinco"};

		Utilidades.<Integer>alReves(numeros);
		Utilidades.alReves(cadenas);

		Utilidades.muestraArray(numeros);
		Utilidades.<String>muestraArray(cadenas);

		Utilidades.inicializa(numeros, 77);
		Utilidades.inicializa(cadenas, "hola");

		Utilidades.muestraArray(numeros);
		Utilidades.muestraArray(cadenas);

	}

}
