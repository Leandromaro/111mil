package ejercicios_en_clases;

import java.util.Scanner;

public class arrayHelpers {

    /**
     *
     * @param vector ordena un vector de forma acendente
     */
    public static void ordenar(int vector[]) {
        int limiteVector = vector.length;
        for (int i = 1; i < limiteVector; i++) {
            int aux = vector[i];
            int j;
            for (j = i - 1; j >= 0 && vector[j] > aux; j--) {
                vector[j + 1] = vector[j];
            }
            vector[j + 1] = aux;
        }
    }

    //cargar Integers en un vector
    /**
     *
     * @param cantidadDatos longitud del vector
     * @param vector
     */
    public static void cargar(int cantidadDatos, int vector[]) {
        Scanner pant = new Scanner(System.in);
        for (int x = 0; x < cantidadDatos; x++) {
            System.out.println("ingrese un numero");
            int numero = pant.nextInt();
            vector[x] = numero;
        }
    }
    /**
     *
     * @param vector
     */
    public static void cargarRandom(int vector[]) {
        for (int x = 0; x < (vector.length); x++) {
            vector[x] = (int) (Math.random() * 100) + 1;
        }
    }
    /**
     *
     * @param vector mostrar vector
     */
    public static void mostrar(int vector[]) {
        for (int x : vector) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    
    public static void ordenarC(char vector[]) {
        int limiteVector = vector.length;
        for (int i = 1; i < limiteVector; i++) {
            int aux = vector[i];
            int j;
            for (j = i - 1; j >= 0 && vector[j] > aux; j--) {
                vector[j + 1] = vector[j];
            }
            vector[j + 1] = (char)aux;
        }
    }
}
