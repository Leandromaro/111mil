/*
Un vector contiene los elementos mostrados a continuación. Los primeros dos
elementos se han ordenado utilizando un algoritmo de inserción. ¿Cuál será el
valor de los elementos del vector después de tres pasadas más del algoritmo?
a. 3 13 8 25 45 23 98 58
 */
package cuarta_guia_ordenamiento_busqueda;

import ejercicios_en_clases.arrayHelpers;

public class Ejercicio3 {

    public static void main(String[] args) {
        int vector[] = {3, 13, 8, 25, 45, 23, 98, 58};
        for (int i = 1; i < 4; i++) {
            int aux = vector[i];
            int j;
            for (j = i - 1; j >= 0 && vector[j] > aux; j--) {
                vector[j + 1] = vector[j];
            }
            vector[j + 1] = aux;
        }
        arrayHelpers.mostrar(vector);

    }

}
