package vehiculos;

public class Main
{

	public static void main(String[] args)
	{
		Vehiculo vehiculo1 = new Vehiculo(4, 200, 0, 1200);
		Vehiculo vehiculo2 = new Vehiculo(2, 250, 0, 200);

		vehiculo1.copia(vehiculo2);


		if(vehiculo1.esIgual(vehiculo2))
		{
			System.out.println("Son iguales");
		}
		else
		{
			System.out.println("No son iguales.");
		}
	}

}
