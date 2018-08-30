/*Crear una aplicacion que pida un numero por teclado y despues comprobar
si es capicua
 */
package tercera_guia_arreglos_COMPLETA;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner pant = new Scanner (System.in);
        System.out.println("ingrese una longitud para el array");
        int longitudArray=pant.nextInt();
        int vector[]=new int [longitudArray];
        for (int x=0;x<vector.length;x++){
            System.out.println("ingrese 1 solo dijito");
            vector[x]=pant.nextInt();
        }
        int inverso=(vector.length)-1;
        boolean condicion=true;
        for (int x=0;x<vector.length;x++){
            if (vector[x]!=vector[inverso]){
                condicion=false;
            }
            inverso--;
        }
        if (condicion){
            System.out.println("el numero es capicua");
        }
        else{
            System.out.println("el numero no es capicua");
        }
    }
    
}
