/*
Crea un vector de 100 posiciones con números aleatorios, luego pedir al usuario
que ingrese un valor y buscar si se encuentra vector
*/
package cuarta_guia_ordenamiento_busqueda;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner pant = new Scanner (System.in);
        System.out.println("ingrese un numero");
        int numero=pant.nextInt();
        int vector[]= new int [100], cont=0, posicion=0;
        for (int x=0;x<vector.length;x++){
            vector[x]=(int)((Math.random()*100)+1);
        }   
        boolean encontrado=false;
        while (!encontrado && cont<vector.length){
            if (vector[cont]==numero){
                encontrado=true;
                posicion=cont;
            }
            cont++;
        }
        if (encontrado){
            System.out.println("esta en la posicion "+posicion);
        }
    }
    
}
