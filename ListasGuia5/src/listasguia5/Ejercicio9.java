//Escriba un programa que permita crear una lista de palabras y lo ordene de manera
//alfabética a medida que sea cargada.
package listasguia5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        List<String> palabras = new ArrayList();
        boolean bandera = true;
        String opcion, aux, palabra;
        Scanner pant = new Scanner(System.in);
        while (bandera) {
            System.out.println("quiere ingresar una palabra? y = si");
            opcion = pant.next();
            if (opcion.equals("y")) {
                System.out.println("ingrese una palabra");
                palabra=pant.next();
                palabras.add(palabra);
                for (int i = 0; i < palabras.size(); i++) {
                    for (int x = i; x < palabras.size(); x++) {
                        if ((palabras.get(i).compareTo(palabras.get(x))) > 0) {
                            aux = palabras.get(i);
                            palabras.set(i, palabras.get(x));
                            palabras.set(x, aux);
                        }
                    }
                }
            } else {
                bandera = false;
            }
        }
        System.out.println("lista");
        for (String i:palabras){
            System.out.println(i);
        }
    }

}
