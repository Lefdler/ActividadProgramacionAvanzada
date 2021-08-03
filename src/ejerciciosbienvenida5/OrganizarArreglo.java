package ejerciciosbienvenida5;

import java.util.Arrays;

public class OrganizarArreglo {
    
    public static void main(String[] args){
        int arregloOrdenado [] = {2,5,21,78,9,42,70};
        Arrays.sort(arregloOrdenado);
            /*
                // Para que el resultado sea de mayor a menor
            for (int i = arregloOrdenado.lenght-1; i >= 0; i--)   
            */
            for (int i = 0; i  < arregloOrdenado.length; i++) {
                
                System.out.println(""+arregloOrdenado[i]);
            }
    }

}
