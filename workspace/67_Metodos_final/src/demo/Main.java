package demo;

public class Main
{

	public static void main(String[] args)
	{
		Demo demo = new Demo();
		demo.metodoFinal();
		demo.metodoNoFinal();

		System.out.println("Ejecución de Subdemo:");
		SubDemo subDemo =  new SubDemo();
		subDemo.metodoFinal();
		subDemo.metodoNoFinal();
		subDemo.metodoDeSubDemo();

	}

}
