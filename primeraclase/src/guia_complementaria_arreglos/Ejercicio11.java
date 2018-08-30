/*
Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y
que los almacene en un array. El programa debe ser capaz de pasar todos los
números pares a las primeras posiciones del array (del 0 en adelante) y todos los
números impares a las celdas restantes. Utiliza arrays auxiliares si es necesario.
*/
package guia_complementaria_arreglos;

import ejercicios_en_clases.arrayHelpers;

public class Ejercicio11 {

    public static void main(String[] args) {
        int longitud=20, vector[] = new int [longitud], aux;
        for (int z=0;z<longitud;z++){
            vector[z]=(int)(Math.random()*100);
        }
        arrayHelpers.mostrar(vector);
        for (int z=0;z<longitud;z++){
            for (int x=0;x<longitud;x++){
                if (vector[x]%2!=0){
                    aux=vector[z];
                    vector[z]=vector[x];
                    vector[x]=aux;
                }
            }
        }
        arrayHelpers.mostrar(vector);
    }
}
    

