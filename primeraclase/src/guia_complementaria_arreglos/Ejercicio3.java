/*
Que rellene un array con los 100 primeros números pares y muestre su suma
 */
package guia_complementaria_arreglos;

import ejercicios_en_clases.arrayHelpers;

public class Ejercicio3 {

    public static void main(String[] args) {
        int longitud=100, cont=2, cargar=0;
        int vector[]= new int [longitud];
        for (int x=0;x<longitud;x++){
            boolean bandera=true;
            while(bandera){
                if (cont%2==0){
                    cargar=cont;
                    bandera=false;
                }
                cont++;
                vector[x]=cargar;
            }
        }
        arrayHelpers.mostrar(vector);
    }   
}