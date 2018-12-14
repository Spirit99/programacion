package puntuaciones;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		final int NUM = 200;
		int cont = 0;
		int[] puntuaciones = new int[6];
		Scanner sc = new Scanner(System.in);
		int puntuacion;
		while(cont < NUM)
		{
			System.out.print("Puntuación (0...5):");
			puntuacion = sc.nextInt();
			if(puntuacion >= 0 && puntuacion <= 5)
			{
				puntuaciones[puntuacion]++;
				cont++;
			}
			else
			{
				System.out.println("Putuación no válida.");
			}
		}
		sc.close();
		System.out.println("Frecuencia:");
		for (int i = 0; i < puntuaciones.length; i++)
		{
			System.out.println(i + ": " + puntuaciones[i] +
					" veces.");
		}
	}

}
