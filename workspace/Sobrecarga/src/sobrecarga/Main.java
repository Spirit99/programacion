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

		Alumno alumno4 = new Alumno("Pepe", 5f);

		System.out.println("Nota de " + alumno4.getNombre() + ": " + alumno4.getNota());

		alumno4.setNombre("Pepe");

		System.out.println(alumno4.getNombre());

		alumno4.subirNota();

		System.out.println(alumno4.getNota());

		alumno4.subirNota(2.3f);

	}

}
