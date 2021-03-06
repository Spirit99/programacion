package almacen;

public class Main
{

    public static void main(String[] args)
    {
        Almacen<Alumno> alumnos = new Almacen<>(30);

        System.out.println(alumnos.anadir(new Alumno("tres", "234234")));
        System.out.println(alumnos.anadir(new Alumno("uno", "1111")));
        System.out.println(alumnos.anadir(new Alumno("UNO", "234234")));
        System.out.println(alumnos.anadir(new Alumno("dos", "234234")));


        System.out.println("Mostrar alumnos:");
        muestaAlumnos(alumnos);


        System.out.println("Existe:");
        System.out.println(alumnos.existe(new Alumno("Uno",null)));
        System.out.println(alumnos.existe(new Alumno("dos",null)));
        System.out.println(alumnos.existe(new Alumno("cuatro",null)));

        System.out.println("Elimina:");
        //System.out.println(alumnos.eliminar(new Alumno("dos", null)));
        //System.out.println(alumnos.eliminar(new Alumno("dos", null)));

        System.out.println("Listado de alumnos:");
        muestaAlumnos(alumnos);

        /*
        // Usar el almacén para rectángulos
        Almacen<Rectangulo> rectangulos = new Almacen<>(3);
        System.out.println(rectangulos.anadir(new Rectangulo(1,2)));
        System.out.println(rectangulos.anadir(new Rectangulo(2,1)));
        System.out.println(rectangulos.anadir(new Rectangulo(1,2)));
        System.out.println(rectangulos.anadir(new Rectangulo(4,8)));

        System.out.println(rectangulos.eliminar(new Rectangulo(1, 2)));

        for(Object obj: rectangulos.getElementos())
        {
            Rectangulo rectangulo = (Rectangulo) obj;
            System.out.println(rectangulo.getBase() + "-" + rectangulo.getAltura());
        }
        */

    }

    private static void muestaAlumnos(Almacen<Alumno> alumnos)
    {
        for(Object obj: alumnos.getElementos())
        {
            Alumno alumno = (Alumno) obj;
            System.out.println(alumno.getNombre() + ": " + alumno.getTelefono());
        }
    }

}
