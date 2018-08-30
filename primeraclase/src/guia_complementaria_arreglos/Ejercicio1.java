/*
Pedir 10 números por teclado y obtener la suma, media aritmética, el número
menor, el número mayor y cuántas veces se repite cada número
 */
package guia_complementaria_arreglos;
import java.util.Scanner;
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner pant = new Scanner (System.in);
        int longitud=10, numero, sumaNumeros=0, numeroMenor=9999, numeroMayor=0, posicionMe=0, posicionMa=0;
        int vector[]=new int [longitud];
        for (int x=0;x<longitud;x++){
            System.out.println("ingrese un numero:");
            numero=pant.nextInt();
            vector[x]=numero;
            sumaNumeros+=numero;
            if (numero>numeroMayor){
                numeroMayor=numero;
                posicionMa=x;
            }
            if (numero<numeroMenor){
                numeroMenor=numero;
                posicionMe=x;
            }
            int numeroRepetido=-1;
            for (int z:vector){
                if (numero==z){
                    numeroRepetido++;
                }
            }
            System.out.println("el numero "+numero+" aparece "+numeroRepetido+" veces");
        }
        System.out.println("la suma de los numeros es "+sumaNumeros);
        System.out.println("la media es "+sumaNumeros/longitud);
        System.out.println("el numero mayor es "+numeroMayor+" y esta en la posicion "+posicionMa);
        System.out.println("el numero menor es "+numeroMenor+" y esta en la posicion "+posicionMe);
    }
    
}
