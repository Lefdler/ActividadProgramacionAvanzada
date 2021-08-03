package ejerciciosbienvenida8;
import java.util.Scanner;

public class StringReves {
	public static void main(String[] args) {
                System.out.println("¡Escribe la palabra que quieras y el resultado te sorprendera!");
                Scanner consola = new Scanner(System.in);
		String palabra = consola.next();
		StringBuilder reves = new StringBuilder(palabra);
		palabra = reves.reverse().toString();
		System.out.println(palabra + "lol");
	}
}

