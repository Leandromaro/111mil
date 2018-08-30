//Escriba un programa que permita crear una lista de palabras y que, a
//continuación, pida una palabra y diga cuántas veces aparece esa palabra en la
//lista.
package listasguia5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner pant = new Scanner (System.in);
        String palabra;
        int contador=0;
        List <String> palabras = new ArrayList ();
        palabras.add("hola");
        palabras.add("hola");
        palabras.add("chau");
        palabras.add("hola");
        System.out.println("ingrese la palabra que desea buscar");
        palabra= pant.next();
        System.out.println("");
        for (String i:palabras){
            if (i.equals(palabra)){
                contador++;
            }
        }
        System.out.println("la palabra que ingreso aparece "+contador+" veces");
    }
    
}
