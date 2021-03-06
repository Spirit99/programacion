package excepciones;

import java.security.InvalidParameterException;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		final int NUM = 5;
		int[] enteros = new int[NUM];
		int posicion = 0;
		Scanner sc = new Scanner(System.in);
		int cont = 0;
		int divisor = 0;
		while(cont < NUM)
		{
			try
			{
				System.out.print("Introduce una posición del array:");
				posicion = Integer.parseInt(sc.nextLine());
				System.out.print("Introduce un divisor:");
				divisor = Integer.parseInt(sc.nextLine());
				enteros[posicion] = 5 / divisor;
				cont++;
			}
			catch(NumberFormatException e)
			{
				System.out.println("No es un número.");
			}
			catch(ArithmeticException e)
			{
				System.out.println("División por cero.");
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Índice no válido.");
			}
			catch(Exception e)
			{
				System.out.println("Excepción indefinida.");
			}


		}



		sc.close();
		System.out.println("El contenido del array de enteros es:");
		for(int valor : enteros)
			System.out.println(valor);
		InvalidParameterException nullPointerException = new InvalidParameterException();
		throw nullPointerException;
	}
}
