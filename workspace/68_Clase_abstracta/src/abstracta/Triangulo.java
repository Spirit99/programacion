package abstracta;

public class Triangulo extends Forma
{
	public Triangulo(String nombre, float base, float altura, float posicionX, float posicionY, String color)
	{
		super(nombre, base, altura, posicionX, posicionY, color);
	}

	@Override
	public float calcularArea()
	{
		return (getBase() * getAltura()) / 2;
	}
}
