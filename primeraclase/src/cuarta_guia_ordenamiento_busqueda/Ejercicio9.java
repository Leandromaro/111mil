/*
Crear un programa que pida al usuario que ingrese una frase por teclado y
transformarla en un array de caracteres. Y ordenarlo de menor a mayor.
 */
package cuarta_guia_ordenamiento_busqueda;

import ejercicios_en_clases.arrayHelpers;
import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner pant = new Scanner (System.in);
        System.out.println("ingrese texto");
        String cadena=pant.next();
        char[] Ccaracteres = cadena.toCharArray();
        arrayHelpers.ordenarC(Ccaracteres);
        for (int x=0;x<Ccaracteres.length;x++){
            System.out.print(Ccaracteres[x] + " ");
        }
    }
    
}
