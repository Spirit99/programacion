package monedas;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		final float[] MONEDAS = {500, 200, 100, 50, 20,
				10, 5, 2, 1, 0.5f, 0.2f,
				0.1f, 0.05f, 0.02f, 0.01f};

		Scanner sc = new Scanner(System.in);
		System.out.print("Cantidad: ");
		float cantidad = sc.nextFloat();
		sc.close();
		int numMonedas;
		for (int i = 0; i < MONEDAS.length && cantidad != 0; i++)
		{
			numMonedas = (int)(cantidad / MONEDAS[i]);
			if(numMonedas >= 1)
			{
				System.out.println(numMonedas + " de " + MONEDAS[i]);
				cantidad -= numMonedas * MONEDAS[i];
			}
		}
	}
}
