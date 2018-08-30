/*Leer 15 números negativos y convertirlos 
a positivos e imprimir dichos números.*/
package segunda_guia_estructura_repetitiva_COMPLETA;
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner pant = new Scanner (System.in);
        int cont=15;
        while (cont>0){
            System.out.println("ingrese el numero "+cont+" negativo");
            int numeroNegativo=pant.nextInt();
            int numeroPositivo=(numeroNegativo)*(-1);
            System.out.println(numeroPositivo);
            cont--;
        }
    }
    
}
