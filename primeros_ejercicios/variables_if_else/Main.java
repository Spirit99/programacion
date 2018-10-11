public class Main
{
	// Este es mi primer programa en java
	public static void main (String[] args) // Este es el método principal
	{
		System.out.println("¡Hola mundo!");

		// Variables
		byte primeraVariable;
		primeraVariable = 127;
		System.out.println(primeraVariable);

		int entera = 2000000000;
		System.out.println(entera);

		long grande = 3000000000L;
		System.out.println(grande);

		float decimalPequeno = 4f;
		System.out.println(decimalPequeno);

		double decimalGrande = 4.546546;
		System.out.println(decimalGrande);

		char letra = 'a';
		System.out.println(letra);

		String cadena = "Esto es una cadena. 3434.";
		System.out.println(cadena);
		
		boolean booleano = true; // false
		System.out.println(booleano);

		// Operadores
		int a = 5;
		int b = 10;
		int c;
				
		// + - * /
		c = a + b;
		System.out.println(c);

		a = a + 7;
		System.out.println(a); // 12

		System.out.println(a + 7); // 19
		System.out.println(a); // 12

		a = a + a * (a / 3) + 2 * a + b - c;
		System.out.println(a); // 

		int contador = 0;
		contador = contador + 1;

		contador++; // postincremenal
		System.out.println("Contador: " + contador); // 2
		System.out.println("Contador: " + contador++); // 2
		// preincremental
		System.out.println("Contador: " + ++contador); // 4
		contador--; // contador = contador - 1;

		// Operadores lógicos
		// == != > < >= <= && (and) || (or)
		booleano = a == b; // false
		System.out.println(booleano); // false
		booleano = a >= b; 
		System.out.println(booleano); // true
		a = 1;
		b = 2;
		c = 3;
		System.out.println(a == 2 || c == 3); // false || true
		System.out.println(a == 2 && c == 3); // false && true
		System.out.println(a == 1 && c == 3); // true && true
		System.out.println((c == a) || (a + 2 == b + 1)); // false || true
		
		// Control de ejecución
		// if
		if(a < b) // true
		{
			System.out.println(a + " es menor que " + b);
		}
		// if - else
		if(a == b) // false
		{
			System.out.println(a + " es igual a " + b);
		}
		else
		{
			System.out.println(a + " y " + b + " son distintos.");
		}
		// if - else if - ... else
		int dia = 7;
		if(dia == 1)
		{
			System.out.println("Lunes");
		}
		else if(dia == 2)
		{
			System.out.println("Martes");
		}
		else if(dia == 3)
		{
			System.out.println("Miércoles");
		}
		else if(dia == 4)
		{
			System.out.println("Jueves");
		}
		else if(dia == 5)
		{
			System.out.println("Viernes");
		}
		else if(dia == 6)
		{
			System.out.println("Sábado");
		}
		else if(dia == 7)
		{
			System.out.println("Domingo");
		}
		else
		{
			System.out.println("Número de día no válido");
		}
		// 
	}
}
