public class Main
{
	public static void main(String[] args)
	{
		for(int tabla = 1; tabla <= 10; tabla++)
		{
			System.out.println("\nTabla del " + tabla);
			System.out.println("------------");
			for(int i = 0; i <= 10; i++)
			{
				System.out.println(tabla + " x " + i + " = " + (tabla * i));
			}
		}
	}
}
