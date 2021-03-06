package rectangulo;

public class Rectangulo
{
	private float base = 1;
	private float altura = 1;
	private float x = 0;
	private float y = 0;

	public Rectangulo(float base, float altura, float x, float y)
	{
		this.base = base;
		this.altura = altura;
		this.x = x;
		this.y = y;
	}
	public Rectangulo(float base, float altura)
	{
		this.base = base;
		this.altura = altura;
	}
	public Rectangulo(float base)
	{
		this.base = base;
	}
	public Rectangulo()
	{

	}
	public float getBase()
	{
		return base;
	}
	public void setBase(float base)
	{
		this.base = base;
	}
	public float getAltura()
	{
		return altura;
	}
	public void setAltura(float altura)
	{
		this.altura = altura;
	}
	public float getX()
	{
		return x;
	}
	public void setX(float x)
	{
		this.x = x;
	}
	public float getY()
	{
		return y;
	}
	public void setY(float y)
	{
		this.y = y;
	}

	public float getArea()
	{
		return base * altura;
	}

	public float getPerimetro()
	{
		return base * 2 + altura * 2;
	}

	public void agranda(float aumentoBase, float aumentoAltura)
	{
		base += aumentoBase;
		altura += aumentoAltura;
	}

	public void agranda(float aumento)
	{
		base += aumento;
		altura += aumento;
	}

	public void agranda()
	{
		base++;
		altura++;
	}

}
