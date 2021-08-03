package ejerciciosbienvenida;

import java.util.Scanner;

public class ParoImpar {

    public static boolean numeroPar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println("Escribe un numero: ");
        Scanner consola = new Scanner(System.in);
        var numero = consola.nextInt();

        if (numeroPar(numero)) {
            System.out.println("El resultado es par " + (numero + numero));
        } else {
            System.out.println("El resultado es impar " + (numero * numero));
        }
    }

}
