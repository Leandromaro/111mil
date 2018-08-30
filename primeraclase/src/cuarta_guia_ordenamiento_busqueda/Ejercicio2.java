/*
Crear un arreglo con 10 posiciones con numero entre el 0 y 9.
Ordenar el mismo de menor a mayor. 
 */
package cuarta_guia_ordenamiento_busqueda;

import ejercicios_en_clases.arrayHelpers;

public class Ejercicio2 {

    public static void main(String[] args) {
        int vector[] = new int[10], aux;
        for (int x = 0; x < vector.length; x++) {
            vector[x] = (int) (Math.random() * 9);
        }
        for (int i = 1; i < vector.length; i++) {
            for (int j = 0; j < vector.length - 1; j++) {
                if (vector[j] > vector[j + 1]) {
                    aux = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = aux;
                }
            }
        }

        arrayHelpers.mostrar(vector);
    }

}
