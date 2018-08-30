/*
Ordenar un arreglo en forma ascendente y luego mostrarlo por pantalla
 */
package guia_complementaria_arreglos;

import ejercicios_en_clases.arrayHelpers;

public class Ejercicio6 {

    public static void main(String[] args) {
        int longitud=10, vector[] = new int [longitud];
        arrayHelpers.cargarRandom(vector);
        arrayHelpers.ordenar(vector);
        arrayHelpers.mostrar(vector);
    }
    
}
