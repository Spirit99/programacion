package alumno;

public class NotaNoValidaException extends Exception
{

	/**
	 *
	 */
	private static final long serialVersionUID = 4275636520789692943L;

	public NotaNoValidaException()
	{
		super("La nota no es válida.");
	}
}
