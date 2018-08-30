/*
Un array contiene los elementos indicados más abajo. Utilizando el algoritmo de
ordenación muestre los intercambios que se realizan para su ordenación.
a. 8 43 17 6 40 16 18 97 11 7
*/
package cuarta_guia_ordenamiento_busqueda;
import ejercicios_en_clases.arrayHelpers;
public class Ejercicio6 {

    public static void main(String[] args) {
        int vector[] = {8,43,17,6,40,16,18,97,7}, aux;
        arrayHelpers.mostrar(vector);
        for (int i = 1; i < vector.length; i++) {
            for (int j = 0; j < vector.length - 1; j++) {
                if (vector[j] > vector[j + 1]) {
                    aux = vector[j];
                    System.out.print("se intercambia "+vector[j]);
                    vector[j] = vector[j + 1];
                    System.out.println (" por "+vector[j+1]);
                    vector[j + 1] = aux;
                    arrayHelpers.mostrar(vector);
                }
            }
        }
    }
    
}
