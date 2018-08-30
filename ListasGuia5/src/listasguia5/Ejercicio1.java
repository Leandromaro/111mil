
//Escriba un programa que permita crear una lista de palabras. Para ello, el
//programa tiene que pedir un número y luego solicitar ese número de palabras
//para crear la lista. Por último, el programa tiene que escribir la lista.
package listasguia5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner pant = new Scanner (System.in);
        int cantidad;
        String palabra;
        List <String> palabras = new ArrayList ();
        System.out.println("ingrese cantidad de palabras");
        cantidad= pant.nextInt();
        System.out.println("");
        for (int i=0;i<cantidad;i++){
            System.out.println("ingrese palabra");
            palabra=pant.next();
            palabras.add(palabra);
        }
        System.out.println("Palabras ingresadas");
        for (String i:palabras){
            System.out.println(i);
        }
        
    }
    
}
