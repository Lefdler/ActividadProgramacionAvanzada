package ejerciciosbienvenida4;

import java.util.Scanner;

public class NumeroPotenciadeDos {

    boolean potenciaDeDos(double numero) {
        if (numero == 1) {
            return true;
        } else if (numero > 1 && numero < 2) {
            return false;
        } else if (numero >= 2) {
            return potenciaDeDos(numero / 2);
        }
        return false;
    }

    public static void main(String[] args) {
        NumeroPotenciadeDos np = new NumeroPotenciadeDos();
        System.out.println("True o False, te diremos si el numero que escribas a continuacion es potencia de 2");
        Scanner consola = new Scanner(System.in);
        for (int i = 0; i < 1; i++) {
            var numero = consola.nextInt();
            System.out.println(np.potenciaDeDos(numero));
        }

    }
}
