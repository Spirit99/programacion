import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		float cantidad = -1;
		float precio;
		float totalFactura = 0;
		System.out.print("Cantidad: ");
		cantidad = sc.nextFloat();
		while(cantidad != 0)
		{
			System.out.print("Precio unit.: ");
			precio = sc.nextFloat();
			totalFactura += cantidad * precio;
			System.out.print("Cantidad: ");
			cantidad = sc.nextFloat();
		}
		if(totalFactura > 1000)
		{
			totalFactura *= 0.95f;
		}
		System.out.println("Total factura: " + totalFactura);
	}
}
