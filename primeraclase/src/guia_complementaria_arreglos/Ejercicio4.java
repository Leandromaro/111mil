/*
Que lea 10 números por teclado, los almacene en un array y muestre la media
*/
package guia_complementaria_arreglos;

import ejercicios_en_clases.arrayHelpers;

public class Ejercicio4 {

    public static void main(String[] args) {
        int longitud=10, vector[] = new int [longitud], suma=0;
        arrayHelpers.cargar(longitud, vector);
        for (int x:vector){
            suma+=x;
        }
        System.out.println("media de los numeros ingresados "+suma/longitud);
    }
    
}
