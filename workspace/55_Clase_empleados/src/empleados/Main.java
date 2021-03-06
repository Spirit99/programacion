package empleados;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Empleado[] empleados = new Empleado[4];

		String nombre;
		String telefono;

		for (int i = 0; i < empleados.length; i++)
		{
			System.out.print("Nombre: ");
			nombre = sc.nextLine();

			System.out.print("Telefono: ");
			telefono = sc.nextLine();

			empleados[i] = new Empleado(nombre, telefono);

		}
		sc.close();
		System.out.println("Empleados:\n----------");

		for (int i = 0; i < empleados.length; i++)
		{
			System.out.println(empleados[i].getNombre() + " Tel: " + empleados[i].getTelefono());
		}

		System.out.println("Número de empleados: " + Empleado.getNumeroEmpleados());
	}
}
