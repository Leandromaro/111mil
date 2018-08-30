/*Generar un arreglo de 30 posiciones con valores de aleatorios no repetidos
entre si y solicitarle al usuario que ingrese un valor por teclado y buscar
en el arreglo si el valor existe
 */
package tercera_guia_arreglos_COMPLETA;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner pant = new Scanner(System.in);
        int limiteVector=30;
        int arreglo[] = new int [limiteVector], numero, contador=0;
        boolean bandera=true;
        while(bandera){
            boolean agregado=true;
            numero=(int)(Math.random()*100)+1;
            for (int x=0;x<arreglo.length;x++){
                if (numero==arreglo[x]){
                    agregado=false;
                }
            }
            if (agregado){
                arreglo[contador]=numero;
                contador++;
                if (contador==arreglo.length){
                    bandera=false;
                    }
                }
            
            }
        System.out.println("ingrese un numero a buscar");
        int buscado=pant.nextInt();
        boolean esta=false;
        for (int x=0;x<arreglo.length;x++){
            if (buscado==arreglo[x]){
                esta=true;
            }
        }
        if (esta){
            System.out.println("el numero esta");
        }
        else{
            System.out.println("el numero no esta");
        }
    }
    
}
