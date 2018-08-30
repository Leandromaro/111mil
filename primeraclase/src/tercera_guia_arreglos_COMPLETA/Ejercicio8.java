/*Crear un vector de la longitud ingresada por pantalla con valores aleatorios
y generar otro vector donde solamente se carguen aquellos valores multiplos de 2
los demas casilleros que no lo sean deben estar en 0
 */
package tercera_guia_arreglos_COMPLETA;

import java.util.Scanner;

public class Ejercicio8 {
 
    public static void main(String[] args) {
        Scanner pant = new Scanner (System.in);
        int longitud = 0;
        System.out.println("ingrese la longitud del vector");
        longitud=pant.nextInt();
        int vector1[]=new int[longitud], vector2[]=new int [longitud];
        for (int i=0;i<vector1.length;i++){
            vector1[i]=(int)(Math.random()*100)+1;
            if (vector1[i]%2==0){
                vector2[i]=vector1[i];
            }
            else{
                vector2[i]=0;
            }
        }
        for (int i=0;i<vector1.length;i++){
            System.out.println("vector 1= "+vector1[i]+"\n vector con multiplos de 2 "+vector2[i]);
        }
    }
    
}
