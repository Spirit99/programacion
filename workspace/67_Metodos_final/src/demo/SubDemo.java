package demo;

public class SubDemo extends Demo
{
	public void metodoDeSubDemo()
	{
		System.out.println("Hola, soy el método de SubDemo.");
	}

	@Override
	public void metodoNoFinal()
	{
		System.out.println("Hola, me han sobreescrito.");
	}

	/*
	public void metodoFinal()
	{

	}
	*/
}
