/* Crear un arreglo para cargar notas de 5 alumnos y cargarlas por teclado
conciderar solamente numeros
 */
package tercera_guia_arreglos_COMPLETA;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int a[]= new int[5];
        Scanner pant = new Scanner (System.in);
        for (int x=0;x<(a.length);x++){
            System.out.println("ingrese la nota del alumno "+(x+1));
            a[x]=pant.nextInt();
        }
    }
    
}
