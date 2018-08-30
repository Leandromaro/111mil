/*
Escribir un programa que rellene un arreglo con los 80 primeros números primos
y luego los visualice
 */
package guia_complementaria_arreglos;

import ejercicios_en_clases.arrayHelpers;

public class Ejercicio9 {

    public static void main(String[] args) {
        boolean primo = true, agregado = false, bandera = true;
        int vector[] = new int[80], contador = 0, cont = 2;
        while (bandera) {
            int numero = cont;
            primo=true;
            agregado=false;
            while (primo && !agregado) {
                if (numero % 2 == 0 && numero != 2) {
                    primo = false;
                } else if (numero % 3 == 0 && numero != 3) {
                    primo = false;
                } else if (numero % 5 == 0 && numero != 5) {
                    primo = false;
                } else if (numero % 7 == 0 && numero != 7) {
                    primo = false;
                } else if (numero % 11 == 0 && numero != 11) {
                    primo = false;
                }
                if (primo) {
                    agregado = true;
                }
                cont++;
            }
            if (agregado) {
                vector[contador] = numero;
                contador++;
                if (contador == vector.length) {
                    bandera = false;
                }
            }
        }
        arrayHelpers.mostrar(vector);
    }

}
