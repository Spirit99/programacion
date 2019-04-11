package alfabetico;

public class Palabra implements Comparable<Palabra>
{
	private String palabra;

	public Palabra(String palabra)
	{
		this.palabra = palabra;
	}
	public String getPalabra()
	{
		return palabra;
	}
	@Override
	public int compareTo(Palabra o)
	{
		return palabra.compareToIgnoreCase(o.getPalabra());
	}
}