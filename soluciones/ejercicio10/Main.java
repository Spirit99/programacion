import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		final int NUM = 10;
		Scanner sc = new Scanner(System.in);
		boolean todosIguales = true;
		int num;
		System.out.print("Número: ");
		int primero = sc.nextInt();
		for(int i = 0; i < NUM - 1; i++) {
			System.out.print("Número: ");
			num = sc.nextInt();
			if(num != primero) {
				todosIguales = false;
			}
		}
		if(todosIguales) {
			System.out.println("Todos son iguales.");
		}
		else {
			System.out.println("No todos son iguales.");
		}
		sc.close();
	}
}
