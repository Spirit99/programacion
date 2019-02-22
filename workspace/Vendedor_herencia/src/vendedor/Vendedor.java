package vendedor;

import empleados.Empleado;

public class Vendedor extends Empleado
{
	private int unidadesVendidas;

	public Vendedor(String nombre, String telefono)
	{
		super(nombre, telefono);
		unidadesVendidas = 0;
	}

	public void sumarUnidades(int unidades)
	{
		unidadesVendidas += unidades;
	}

	public int getUnidadesVendidas()
	{
		return unidadesVendidas;
	}
}
