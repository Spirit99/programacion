package sobrecarga;

public class Main
{

	public static void main(String[] args)
	{
		Alumno alumno1 = new Alumno("Pepe");


		alumno1.setAñoNacimiento(2000);
		alumno1.setNota(7.8f);


		Alumno alumno2 = new Alumno("Ana", 1996);

		Alumno alumno3 = new Alumno("Juan", 1990, 9.5f);

		Alumno alumno4 = new Alumno();

		System.out.println(alumno4.getNombre());



	}

}