package sobrecarga;

public class Alumno
{
	private String nombre;
	private int añoNacimiento;
	private float nota;

	public Alumno()
	{
		nombre = "Manolo";
		añoNacimiento = 1996;
		nota = 10f;
	}

	public Alumno(String nombre)
	{
		this.nombre = nombre;
	}

	public Alumno(String nombre, int añoNacimiento)
	{
		this.nombre = nombre;
		this.añoNacimiento = añoNacimiento;
	}

	public Alumno(String nombre, int añoNacimiento, float nota)
	{
		this.nombre = nombre;
		this.añoNacimiento = añoNacimiento;
		this.nota = nota;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public int getAñoNacimiento()
	{
		return añoNacimiento;
	}

	public void setAñoNacimiento(int añoNacimiento)
	{
		this.añoNacimiento = añoNacimiento;
	}

	public float getNota()
	{
		return nota;
	}

	public void setNota(float nota)
	{
		this.nota = nota;
	}

}