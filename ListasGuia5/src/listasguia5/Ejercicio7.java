//Escriba un programa que permita crear una lista de palabras y que, a
//continuación, elimine los elementos repetidos (dejando únicamente el primero de
//los elementos repetidos). Nota: crear un LIST y hacer que se comporte como un
//SET
package listasguia5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner pant = new Scanner(System.in);
//        metodo facil
//        Collection <String> hola = new ArrayList();
//        hola.add("hola");
//        hola.add("chau");
//        hola.add("chau");
//        hola.add("hola");
//        System.out.println("Lista normal");
//        for (String i:hola){
//            System.out.println(i);
//        }
//        Set <String> set= new HashSet (hola);
//        System.out.println("Lista set");
//        for (String i:set){
//            System.out.println(i);
//        }
        boolean bandera = true;
        String opcion, palabra;
        List<String> palabras = new ArrayList();
        while (bandera) {
            System.out.println("desea ingresar otra palabra? ingrese un y");
            opcion = pant.next();
            if (opcion.equals("y")) {
                System.out.println("ingrese una palabra");
                palabra = pant.next();
                if (palabras.size() == 0) {
                    palabras.add(palabra);
                } else {
                    boolean encontrado=true;
                    for(String i: palabras) {
                        if (i.equals(palabra)) {
                            encontrado=false;
                        }
                    }
                    if (encontrado){
                        palabras.add(palabra);
                    }
                }
                
            } else {
                bandera = false;
            }
        }
        System.out.println("lista");
        for (String i : palabras) {
            System.out.println(i);
        }
    }

}
