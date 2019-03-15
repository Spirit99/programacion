package sobreescritura;

public class Gato extends Animal
{
	public Gato(String nombre, int anyoNacimiento)
	{
		super(nombre, anyoNacimiento);
	}

	@Override
	public void emiteSonido()
	{

		System.out.println("Miau");
		super.emiteSonido();
	}




}
