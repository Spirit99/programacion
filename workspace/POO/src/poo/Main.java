package poo;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		/*
		Pelicula pelicula = new Pelicula("spiderman", "sadfsad", 2018);

		System.out.println(pelicula.getTitulo());

		Pelicula[] peliculas = new Pelicula[4];

		Scanner sc = new Scanner(System.in);

		String titulo;
		String director;
		int añoEstreno;

		for (int i = 0; i < peliculas.length; i++)
		{
			System.out.print("Título: ");
			titulo = sc.nextLine();

			System.out.print("Director: ");
			director = sc.nextLine();

			System.out.print("Año de estreno: ");
			añoEstreno = Integer.parseInt(sc.nextLine());

			peliculas[i] = new Pelicula(titulo, director, añoEstreno);
		}

		sc.close();

		System.out.println("Listado de títulos:");
		for (int i = 0; i < peliculas.length; i++)
		{
			System.out.println(peliculas[i].getTitulo());
		}


		peliculas[0].setTitulo("Nuevo título");
		 */

		Pelicula film = new Pelicula("t1", "d1", 1);
		System.out.println(film.getTotalEspectadores());
		film.sumaEspectadores(2000);
		film.sumaEspectadores(5000);
		film.sumaEspectadores(2000);

		System.out.println(film.getTotalEspectadores());

		Pelicula pelicula1 = new Pelicula("t1", "d1", 1);


		Pelicula auxPelicula = pelicula1;

		pelicula1.setTitulo("Nuevo título");

		System.out.println(pelicula1.getTitulo());

		System.out.println(auxPelicula.getTitulo());

		int a = 3;
		int aux = a;
		a = 0;
	}
}
