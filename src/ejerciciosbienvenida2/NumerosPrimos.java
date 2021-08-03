package ejerciciosbienvenida2;
import java.util.Scanner;
public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner consola2 = new Scanner(System.in);

        int limite;

        System.out.println("Escribe un numero: ");
        limite = consola2.nextInt();

        for (int i = 1; i < limite; i++) {
            int contador = 0;
            for (int t = 1; t <= i; t++) {
                if (i % t == 0) {
                    contador++;
                }
            }
            if (contador == 2) {
                System.out.println(i);
            }
        }

    }
}
