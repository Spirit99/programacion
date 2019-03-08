package caja;

public class CajaRegistradora implements ICajaRegistradora
{
	private Bandeja[] bandejas;
	private String nombre;

	private final static double[] tipoMonedas = {0.02d, 0.05d, 0.1d,
			0.2d, 0.5d, 1d, 2d, 5d, 10d, 20d, 50d, 100d, 200d};

	public CajaRegistradora(String nombre)
	{
		this.nombre = nombre;


		bandejas = new Bandeja[tipoMonedas.length];

		for (int i = 0; i < tipoMonedas.length; i++)
		{
			bandejas[i] = new Bandeja(tipoMonedas[i]);
		}

	}

	@Override
	public String getNombre()
	{
		return nombre;
	}

	@Override
	public int getNumTipoMonedas()
	{
		int contTipos = 0;
		for (int i = 0; i < bandejas.length; i++)
		{
			if(bandejas[i].getContador() > 0)
			{
				contTipos++;
			}
		}
		return contTipos;
	}

	/**
	 * @param tipo
	 * @return Devuelve el índice de la bandeja del
	 * tipo de moneda. -1 si no se encuentra dicha moneda
	 */
	private int posicionTipoMoneda(double tipo)
	{
		for (int i = 0; i < bandejas.length; i++)
		{
			if(bandejas[i].getTipo() == tipo)
			{
				return i;
			}
		}
		return -1;
	}


	@Override
	public int getUnidadesTipoMoneda(double tipo)
	{
		int posicion = posicionTipoMoneda(tipo);
		if(posicion == -1)
		{
			return -1;
		}

		return bandejas[posicion].getContador();
	}

	@Override
	public boolean meterMonedas(double tipo, int unidades)
	{
		int posicion = posicionTipoMoneda(tipo);
		if(posicion == -1)
		{
			return false;
		}

		bandejas[posicion].meterUnidades(unidades);
		return true;
	}

	@Override
	public boolean monedaValida(double tipo)
	{
		return posicionTipoMoneda(tipo) != -1;
	}

	@Override
	public boolean sacarMonedas(double tipo, int unidades)
	{
		int posicion = posicionTipoMoneda(tipo);
		if(posicion == -1)
		{
			return false;
		}

		return bandejas[posicion].sacarUnidades(unidades);
	}

	@Override
	public void vaciarCajaRegistradora()
	{
		for (int i = 0; i < bandejas.length; i++)
		{
			bandejas[i].vaciar();
		}

	}

	@Override
	public double[] getTiposDeMonedas()
	{
		return tipoMonedas;
	}

	@Override
	public double getSaldo()
	{
		double saldo = 0;
		for (int i = 0; i < bandejas.length; i++)
		{
			saldo += bandejas[i].getSaldo();
		}
		return saldo;
	}

	private class Bandeja
	{
		private double tipo;
		private int cont;

		public Bandeja(double tipo)
		{
			this.tipo = tipo;
			cont = 0;
		}

		public int getContador()
		{
			return cont;
		}

		public double getTipo()
		{
			return tipo;
		}

		public void meterUnidades(int unidades)
		{
			cont += unidades;
		}

		public boolean sacarUnidades(int unidades)
		{
			if(unidades <= cont)
			{
				cont -= unidades;
				return true;
			}
			else
			{
				return false;
			}
		}


		public void vaciar()
		{
			cont = 0;
		}

		public double getSaldo()
		{
			return cont * tipo;
		}

	}

}
