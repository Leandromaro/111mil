/*
Construir un programa en java que permita encontrar el número mayor y el
número menor de una serie de números ingresados por teclado, como primera
entrada se le dará el tamaño del arreglo y luego los datos, también se debe indicar
cuantas veces se repiten tanto el mayor como el menor. Ej
Entrada:
2 -4 -13 1 -3 15 1 9 6 -8 4 23 7 -13 13 23 15 -13 9 0
Salida:
El mayor es: 23 y se repite 2 veces.
El menor es: -13 y se repite 3 veces.
*/
package guia_complementaria_arreglos;
import ejercicios_en_clases.arrayHelpers;
import java.util.Scanner;
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner pant = new Scanner (System.in);
        System.out.println("ingrese la cantidad de datos que quiere cargar");
        int longitud=pant.nextInt();
        int vector[] = new int [longitud], contMa=0, contMe=0;
        arrayHelpers.cargar(longitud, vector);
        int menor=vector[0], mayor=vector[0];
        for (int x=0;x<longitud;x++){
            if (vector[x]>mayor){
                mayor=vector[x];
            }
            if (vector[x]<menor){
                menor=vector[x];
            }
        }
        for (int x=0;x<longitud;x++){
            if (vector[x]==mayor){
                contMa++;
            }
            if (vector[x]==menor){
                contMe++;
            }
        }
        arrayHelpers.mostrar(vector);
        System.out.println();
        System.out.println("El numero mayor fue "+mayor+" y aparecio "+contMa+"veces");
        System.out.println("El numero menor fue "+menor+"y aparecio "+contMe+" veces");
    }
    
}
