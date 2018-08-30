//Escriba un programa que permita crear dos listas de palabras y que, a
//continuación, elimine de la primera lista los nombres de la segunda lista.
package listasguia5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ejercicio5 {

    public static void main(String[] args) {
        List <String> palabras1 = new ArrayList ();
        List <String> palabras2 = new ArrayList ();
        palabras1.add("hola");
        palabras1.add("gato");
        palabras1.add("perro");
        palabras1.add("hola");
        palabras2.add("hola");
        palabras2.add("gato");
        System.out.println("Lista original");
        for (String i:palabras1){
            System.out.println(i);
        }
        for (int i=0;i<palabras2.size();i++){
            for (int x=0;x<palabras1.size();x++){
                if (palabras1.get(x).equals(palabras2.get(i))){
                    palabras1.remove(x);
                }
            }
        }
        System.out.println("Lista modificada");
        for (String i:palabras1){
            System.out.println(i);
        }
    }
    
}
