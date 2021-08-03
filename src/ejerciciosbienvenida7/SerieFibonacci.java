package ejerciciosbienvenida7;
import java.util.Scanner;
public class SerieFibonacci {
    public static void main(String[] args){
        
        Scanner consola = new Scanner(System.in);
        System.out.println("Escribe el numero que quieras y se generara la serie Fibonacci");
        int numeros = consola.nextInt();
        int h =0;
        int v1 = 1;
        int v2;
        for (int i=1; i<=numeros; i++){
            v2 = h;
            h = v1 + h;
            v1 = v2;
            System.out.println(v1);
        }
        
    }
    
    
    
}
