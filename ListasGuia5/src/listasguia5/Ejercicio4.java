//Escriba un programa que permita crear una lista de palabras y que, a
//continuación, pida una palabra y elimine esa palabra de la lista.
package listasguia5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner pant = new Scanner (System.in);
        String palabra1;
        List <String> palabras = new ArrayList ();
        palabras.add("hola");
        palabras.add("hola");
        palabras.add("chau");
        palabras.add("chau");
        palabras.add("chau");
        palabras.add("hola");
        System.out.println("Lista original");
        for (String i:palabras){
            System.out.println(i);
        }
        System.out.println("ingrese la palabra a eliminar");
        palabra1= pant.nextLine();
        Iterator <String> palabrasI = palabras.iterator();
        while (palabrasI.hasNext()){
            if (palabrasI.next().equals(palabra1)){
                palabrasI.remove();
            }
        }
         System.out.println("Lista modificada");
        for (String i:palabras){
            System.out.println(i);
        }
    }
    }