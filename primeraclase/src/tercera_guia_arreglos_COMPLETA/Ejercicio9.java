/*crear un programa que pida una frase por teclado
y hacer un array de caracteres
 */
package tercera_guia_arreglos_COMPLETA;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner pant = new Scanner (System.in);
        System.out.println("ingrese texto");
        String cadena=pant.next();
        char[] Ccaracteres = cadena.toCharArray();
        for (int i=0;i<Ccaracteres.length;i++){
            System.out.println(Ccaracteres[i]);
        }
    }
    
}
