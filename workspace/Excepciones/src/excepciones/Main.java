package excepciones;


public class Main
{
	public static void main(String[] args)
	{
		int[] numeros = new int[10];

		String[] cadenas = new String[10];

		try
		{
			Integer.parseInt("4O0");


			System.out.println("Hola");

			System.out.println(cadenas[0].length());

			numeros[100000] = 4;

			System.out.println("Adiós");



		}
		catch(NullPointerException e)
		{
			System.out.println("Error. Objeto nulo.");
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Acceso incorrecto a la memoria.");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Error de formato.");
		}
		catch(Exception e)
		{
			System.out.println("Error indefinido.");
		}
		finally
		{
			System.out.println("Esto se ejecuta siempre.");
		}
	}
}
