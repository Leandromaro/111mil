//Escriba un programa que permita crear una lista de palabras y que, a
//continuación, pida dos palabras y sustituya la primera por la segunda en la lista.
package listasguia5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner pant = new Scanner (System.in);
        String palabra1, palabra2;
        List <String> palabras = new ArrayList ();
        palabras.add("hola");
        palabras.add("hola");
        palabras.add("chau");
        palabras.add("hola");
        System.out.println("Lista original");
        for (String i:palabras){
            System.out.println(i);
        }
        System.out.println("ingrese la palabra a reemplazar");
        palabra1= pant.next();
        System.out.println("ingrese la palabra por la que desea reemplazar");
        palabra2= pant.next();
       
        for (int i=0;i<palabras.size();i++){
            if (palabras.get(i).equals(palabra1)){
                palabras.set(i, palabra2);
            }
        }
         System.out.println("Lista modificada");
        for (String i:palabras){
            System.out.println(i);
        }
    }
    }
    

