package application;

public class Ahorcado implements IAhorcado
{

	private String fraseAAdivinar;
	private char[] panel;
	private int intentos;
	private int fallos;

	private static final char MARCA = '-';

	public Ahorcado()
	{

	}


	@Override
	public void partidaNueva(String fraseAAdivinar)
	{
		this.fraseAAdivinar = fraseAAdivinar.toUpperCase();
		panel = new char[fraseAAdivinar.length()];
		for (int i = 0; i < fraseAAdivinar.length(); i++)
		{
			if(fraseAAdivinar.charAt(i) == ' ')
			{
				panel[i] = ' ';
			}
			else
			{
				panel[i] = MARCA;
			}
		}
		intentos = 0;
		fallos = 0;

	}

	@Override
	public int getNumeroIntentos()
	{
		return intentos;
	}

	@Override
	public boolean ponerLetra(char letra)
	{
		boolean hayAcierto = false;

		// letra = (letra + "").toUpperCase().charAt(0);

		letra = Character.toUpperCase(letra);

		for (int i = 0; i < fraseAAdivinar.length(); i++)
		{
			if(fraseAAdivinar.charAt(i) != ' ' &&
					letra == fraseAAdivinar.charAt(i) &&
					panel[i] == MARCA)
			{
				panel[i] = letra;
				hayAcierto = true;
			}
		}
		intentos++;
		if(!hayAcierto)
		{
			fallos++;
		}
		return hayAcierto;
	}

	@Override
	public int getNumeroFallos()
	{
		return fallos;
	}

	@Override
	public boolean panelCompleto()
	{
		for (int i = 0; i < panel.length; i++)
		{
			// Si me encuentro una letra
			if(panel[i] == MARCA)
			{
				return false;
			}
		}
		return true;
	}

	@Override
	public String getPanel()
	{
		return String.valueOf(panel);
	}

}
