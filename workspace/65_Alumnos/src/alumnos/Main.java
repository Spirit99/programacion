package alumnos;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		final int NUM_ALUMNOS = 10;
		Alumno[] alumnos = new Alumno[NUM_ALUMNOS];
		Scanner sc = new Scanner(System.in);
		String nombre;
		String strNotas;
		for (int i = 0; i < alumnos.length; i++)
		{
			// Nombre
			System.out.println("Introduzca nombre:");
			nombre = sc.nextLine();
			alumnos[i] = new Alumno(nombre);
			// Notas
			System.out.println("Introduzca notas separadas por espacios:");
			strNotas = sc.nextLine();

			Scanner scLinea = new Scanner(strNotas);
			int nota;
			while(scLinea.hasNextInt())
			{
				nota = scLinea.nextInt();
				if(!alumnos[i].anadeNota(nota))
				{
					System.out.println("La nota " + nota + " no se pudo añadir.");
				}
			}
			scLinea.close();
			/*
			String[] strNotas = notas.split(" ");
			for(String nota: strNotas)
			{
				if(!alumnos[i].anadeNota(Integer.parseInt(nota)))
				{
					System.out.println("La nota " + nota + " no se pudo añadir");
				}
			}
			*/

		}
		sc.close();
		// Listar alumnos
		System.out.println("Listado de alumnos:");
		System.out.println("Nombre\tNúmero\tAprobados\tMedia");
		for (int i = 0; i < alumnos.length; i++)
		{
			System.out.println(alumnos[i].getNombre() + "\t" +
					alumnos[i].numNotas() + "\t" +
					alumnos[i].getNumeroAprobados() + "\t\t" +
					(alumnos[i].getNotaMedia() == -1 ? "-" : alumnos[i].getNotaMedia()));
		}
	}
}
