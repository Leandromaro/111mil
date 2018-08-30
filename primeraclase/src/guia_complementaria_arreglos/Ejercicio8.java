/*
Llenar un arreglo de tamaño 20 con números aleatorios en el mismo rango
usando Math.random, luego mostrar el mayor número de todos
 */
package guia_complementaria_arreglos;

import ejercicios_en_clases.arrayHelpers;

public class Ejercicio8 {

    public static void main(String[] args) {
        int mayor=0, longitud=20, vector[] = new int  [longitud];
        for (int x=0;x<longitud;x++){
            vector[x]=(int)(Math.random()*20)+1;
        }
        for (int x=0;x<longitud;x++){
            if (vector[x]>mayor){
                mayor=vector[x];
            }
        }
        arrayHelpers.mostrar(vector);
        System.out.println("el numero mayor es "+mayor);
    }
    
}
