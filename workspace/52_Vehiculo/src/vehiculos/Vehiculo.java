package vehiculos;

public class Vehiculo
{
	private int numeroRuedas;
	private int velocidadMaxima;
	private int velocidadActual;
	private int peso;
	public Vehiculo(int numeroRuedas, int velocidadMaxima, int velocidadActual, int peso)
	{
		this.numeroRuedas = numeroRuedas;
		this.velocidadMaxima = velocidadMaxima;
		this.velocidadActual = velocidadActual;
		this.peso = peso;
	}
	public int getNumeroRuedas()
	{
		return numeroRuedas;
	}
	public void setNumeroRuedas(int numeroRuedas)
	{
		this.numeroRuedas = numeroRuedas;
	}
	public int getVelocidadMaxima()
	{
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(int velocidadMaxima)
	{
		this.velocidadMaxima = velocidadMaxima;
	}
	public int getVelocidadActual()
	{
		return velocidadActual;
	}
	public void setVelocidadActual(int velocidadActual)
	{
		this.velocidadActual = velocidadActual;
	}
	public int getPeso()
	{
		return peso;
	}
	public void setPeso(int peso)
	{
		this.peso = peso;
	}


	public boolean esIgual(Vehiculo vehiculo)
	{
		return numeroRuedas == vehiculo.getNumeroRuedas()
				&& velocidadActual == vehiculo.getVelocidadActual()
				&& velocidadMaxima == vehiculo.getVelocidadMaxima()
				&& peso == vehiculo.getPeso();
	}


	public void copia(Vehiculo vehiculo)
	{
		numeroRuedas = vehiculo.getNumeroRuedas();
		velocidadActual = vehiculo.getVelocidadActual();
		velocidadMaxima = vehiculo.getVelocidadMaxima();
		peso = vehiculo.getPeso();
	}


}
