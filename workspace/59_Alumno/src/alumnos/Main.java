package alumnos;

import java.util.Scanner;

public class Main
{

	private static Alumnos alumnos;
	private static Scanner sc;



	public static void main(String[] args)
	{

		alumnos = new Alumnos(5);
		sc = new Scanner(System.in);

		String opcion = "";
		while(!opcion.equals("6"))
		{
			mostrarMenu();
			opcion = sc.nextLine();
			switch(opcion)
			{
				case "1":
					listarAlumnos();
					break;
				case "2":
					añadirAlumno();
					break;
				case "3":
					eliminarAlumno();
					break;
				case "4":
					ponerNota();
					break;
				case "5":
					borrarNota();
					break;
			}
		}

	}

	private static void borrarNota()
	{
		System.out.print("Nombre: ");
		String nombre = sc.nextLine();
		if(alumnos.existe(new Alumno(nombre)))
		{
			System.out.print("Evaluación (1,2,3):");
			int evaluacion = Integer.parseInt(sc.nextLine());
			if(Validar.evaluacionValida(evaluacion))
			{
				alumnos.borrarNota(new Alumno(nombre), evaluacion);
			}
			else
			{
				System.out.println("Evaluación no válida.");
			}
		}
		else
		{
			System.out.println("No existe.");
		}

	}

	private static void ponerNota()
	{
		System.out.print("Nombre: ");
		String nombre = sc.nextLine();
		if(alumnos.existe(new Alumno(nombre)))
		{
			System.out.print("Evaluación (1,2,3):");
			int evaluacion = Integer.parseInt(sc.nextLine());
			if(Validar.evaluacionValida(evaluacion))
			{
				System.out.print("Nota: ");
				double nota = Double.parseDouble(sc.nextLine());
				if(Validar.notaValida(nota))
				{
					alumnos.ponerNota(new Alumno(nombre), evaluacion, nota);
				}
				else
				{
					System.out.println("Nota no válida.");
				}

			}
			else
			{
				System.out.println("Evaluación no válida.");
			}
		}
		else
		{
			System.out.println("No existe.");
		}
	}

	private static void eliminarAlumno()
	{
		System.out.print("Nombre: ");

		if(alumnos.eliminarAlumno(new Alumno(sc.nextLine())))
		{
			System.out.println("Eliminado.");
		}
		else
		{
			System.out.println("No encontrado.");
		}
	}

	private static void listarAlumnos()
	{
		Alumno[] alums = alumnos.getAlumnos();
		System.out.println("Nombre\t1ev\t2ev\t3ev");
		for (int i = 0; i < alums.length; i++)
		{
			System.out.println(alums[i].getNombre() +
					"\t" + formatea(alums[i].getNota(1)) +
					"\t" + formatea(alums[i].getNota(2)) +
					"\t" + formatea(alums[i].getNota(3)));
		}
	}

	private static String formatea(double nota)
	{
		if(nota == -1)
		{
			return "-";
		}
		else
		{
			return nota + "";
		}
	}

	private static void añadirAlumno()
	{
		if(alumnos.estaLleno())
		{
			System.out.println("Todo lleno.");
		}
		else
		{
			System.out.print("Nombre: ");
			String nombre = sc.nextLine();
			if(!alumnos.añadirAlumno(new Alumno(nombre)))
			{
				System.out.println("Alumno ya existe.");
			}
		}
	}

	private static void mostrarMenu()
	{
		System.out.println("Opciones\n" +
			"1.- Listar alumnos.\n" +
			"2.- Añadir alumno.\n" +
			"3.- Eliminar alumno.\n" +
			"4.- Poner nota.\n" +
			"5.- Borrar nota.\n" +
			"6.- Salir.");
	}

}
