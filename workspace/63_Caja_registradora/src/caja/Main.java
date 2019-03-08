package caja;

import java.util.Scanner;

public class Main
{


	private static CajaRegistradora cajaRegistradora;
	private static Scanner sc;

	public static void main(String[] args)
	{

		cajaRegistradora = new CajaRegistradora(null);


		sc = new Scanner(System.in);
		int opcion = 0;
		while(opcion != 6)
		{
			mostrarMenu();
			opcion = sc.nextInt();
			switch(opcion)
			{
				case 1: // Ingresar monedas
					ingresarMonedas();
				break;
				case 2: // Listar contenido
					listarContenido();
				break;
				case 3: // Mostrar saldo
					mostrarSaldo();
				break;
				case 4: // Extraer monedas
					extraerMonedas();
				break;
				case 5: // Vaciar caja
					vaciarCaja();
				break;
				case 6: // Salir

				break;

			}
		}
		sc.close();
	}

	private static void ingresarMonedas()
	{
		double tipo;
		System.out.print("Tipo: ");
		tipo = sc.nextDouble();
		if(!cajaRegistradora.monedaValida(tipo))
		{
			System.out.println("No válida.");
		}
		else
		{
			int unidades;
			System.out.print("Unidades: ");
			unidades = sc.nextInt();
			cajaRegistradora.meterMonedas(tipo, unidades);
		}
	}
	private static void listarContenido()
	{
		double[] tipos = cajaRegistradora.getTiposDeMonedas();

		// for each
		for(double tipo : tipos)
		{
			System.out.print(tipo + "\t");
		}
		System.out.println();
		for(double tipo : tipos)
		{
			System.out.print(cajaRegistradora.getUnidadesTipoMoneda(tipo) + "\t");
		}
		System.out.println();
	}

	private static void mostrarSaldo()
	{
		System.out.println(cajaRegistradora.getSaldo());
	}
	private static void extraerMonedas()
	{
		double tipo;
		System.out.print("Tipo: ");
		tipo = sc.nextDouble();
		if(!cajaRegistradora.monedaValida(tipo))
		{
			System.out.println("No válida.");
		}
		else
		{
			int unidades;
			System.out.print("Unidades: ");
			unidades = sc.nextInt();
			if(!cajaRegistradora.sacarMonedas(tipo, unidades))
			{
				System.out.println("No hay saldo.");
			}
		}
	}
	private static void vaciarCaja()
	{
		cajaRegistradora.vaciarCajaRegistradora();
	}
	private static void mostrarMenu()
	{
		System.out.println("1.- Ingresar monedas.\n" +
				"2.- Listar contenido.\n" +
				"3.- Mostrar saldo.\n" +
				"4.- Extraer monedas.\n" +
				"5.- Vaciar caja.\n" +
				"6.- Salir.");
	}

}
