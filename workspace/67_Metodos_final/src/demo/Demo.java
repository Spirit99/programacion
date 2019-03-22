package demo;

public class Demo
{
	public Demo()
	{
		super();
	}

	public void metodoNoFinal()
	{
		System.out.println("Hola, soy el método no final.");
	}

	public final void metodoFinal()
	{
		System.out.println("Hola, soy el método final.");
	}
}
