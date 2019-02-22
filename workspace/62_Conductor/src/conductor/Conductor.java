package conductor;

import empleados.Empleado;

public class Conductor extends Empleado
{
	private double totalKilometros;
	private StringBuilder ciudadesRecoridas;

	public Conductor(String nombre, String telefono)
	{
		super(nombre, telefono);
		totalKilometros = 0;
		ciudadesRecoridas = new StringBuilder();
	}

	public void sumarKilometros(double kms)
	{
		totalKilometros += kms;
	}

	public double getTotalKilometros()
	{
		return totalKilometros;
	}

	public void pasaPorCiudad(String ciudad)
	{
		ciudadesRecoridas.append(ciudad + ",");
	}

	public String[] getCiudadesRecorridas()
	{
		return ciudadesRecoridas.toString().split(",");
	}

}
