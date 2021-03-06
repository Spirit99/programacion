package almacen;

public class Alumno implements IComparador
{
	private String nombre;
	private String telefono;
	public Alumno(String nombre, String telefono)
	{
		super();
		this.nombre = nombre;
		this.telefono = telefono;
	}
	public String getTelefono()
	{
		return telefono;
	}
	public void setTelefono(String telefono)
	{
		this.telefono = telefono;
	}
	public String getNombre()
	{
		return nombre;
	}
	@Override
	public boolean esMayor(Object o)
	{
		Alumno alumno = (Alumno) o;
		if(nombre.compareToIgnoreCase(alumno.getNombre()) <= 0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	@Override
	public boolean sonIguales(Object o)
	{
		Alumno alumno = (Alumno) o;
		if(alumno.getNombre().equalsIgnoreCase(nombre))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
