import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String nombre = "";
		String nombreMenor = "";
		int minEdad = Integer.MAX_VALUE;
		int edad;
		int suma = 0;
		int contAlumnos = 0;
		System.out.print("Nombre: ");
		nombre = sc.nextLine();
		while(!nombre.equals("fin"))
		{
			System.out.print("Edad: ");
			edad = Integer.parseInt(sc.nextLine());
			contAlumnos++;
			suma += edad;
			if(edad < minEdad)
			{
				minEdad = edad;
				nombreMenor = nombre;
			}

			System.out.print("Nombre: ");
			nombre = sc.nextLine();
		}
		sc.close();
		if(contAlumnos > 0)
		{
			System.out.println("Edad media: " + (suma / (float)contAlumnos) +
				" Alumno más joven: " + nombreMenor + ".");
		}
		else
		{
			System.out.println("No hay alumnos.");
		}
	}
}
