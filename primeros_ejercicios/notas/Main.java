import java.util.Scanner;
public class Main
{
	public static void main (String[] args)
	{
		Scanner teclado = new Scanner(System.in);

		System.out.println("Nota (0 a 10):");

		int nota = teclado.nextInt();

		// Cerramos scanner
		teclado.close();

		/*
		Notas:
		0 .. 4	Suspenso
		5		Aprobado
		6		Bien
		7 .. 8	Notable
		9 .. 10	Sobresaliente
		Nota no válida.
		*/

		if(nota >= 0 && nota <= 4)
		{
			System.out.println("Suspenso.");
		}
		else if(nota == 5)
		{
			System.out.println("Aprobado.");
		}
		else if(nota == 6)
		{
			System.out.println("Bien.");
		}
		else if(nota >= 7 && nota <= 8) // else if(nota == 7 || nota == 8)
		{
			System.out.println("Notable.");
		}
		else if(nota >= 9 && nota <= 10)
		{
			System.out.println("Sobresaliente.");
		}
		else
		{
			System.out.println("Nota no válida.");
		}
	}
}
