package sobreescritura;

public class Animal
{
	private String nombre;
	private int anyoNacimiento;
	public Animal(String nombre, int anyoNacimiento)
	{
		super();
		this.nombre = nombre;
		this.anyoNacimiento = anyoNacimiento;
	}
	public String getNombre()
	{
		return nombre;
	}
	public int getAnyoNacimiento()
	{
		return anyoNacimiento;
	}

	public void emiteSonido()
	{
		System.out.println("dfjgndfg");
	}

}
