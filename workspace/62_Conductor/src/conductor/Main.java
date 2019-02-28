package conductor;

public class Main
{

    public static void main(String[] args)
    {
        Conductor conductor = new Conductor("pepe", "232343");


        conductor.pasaPorCiudad("Alicante");
        conductor.pasaPorCiudad("Murcia");

        String[] ciudades = conductor.getCiudadesRecorridas();

        for (int i = 0; i < ciudades.length; i++)
        {
            System.out.println(ciudades[i]);
        }

        conductor.sumarKilometros(104.23);
        conductor.sumarKilometros(95.77);

        System.out.println(conductor.getTotalKilometros());

    }

}