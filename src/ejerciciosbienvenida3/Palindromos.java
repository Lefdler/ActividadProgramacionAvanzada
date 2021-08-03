package ejerciciosbienvenida3;

import java.util.Scanner;

public class Palindromos {

    public static void main(String[] args) {
        
        System.out.println("Escribe un grupo de numeros o una palabra y te diremos si es un palidromo: ");
        Scanner consola = new Scanner(System.in);

        String palabra = consola.nextLine();

        int contador = 1;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) != palabra.charAt(palabra.length() - 1 - i)) {
                contador = 0;
                break;
            }
        }
        System.out.println(contador == 1 ? "es palindromo" : "no es palindromo");
    }
}
