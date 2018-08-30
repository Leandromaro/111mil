
//Escriba un programa que permita crear una lista de palabras y que, a
//continuación, cree una segunda lista igual a la primera, pero al revés (no se trata
//de escribir la lista al revés, sino de crear una lista distinta).
package listasguia5;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio6 {

    public static void main(String[] args) {
        List <String> palabras= new ArrayList();
        palabras.add("uno");
        palabras.add("dos");
        palabras.add("tres");
        palabras.add("cuatro");
        List <String> palabrasinver = new ArrayList ();
        for (int i=palabras.size()-1;i>=0;i--){
            palabrasinver.add(palabras.get(i));
        }
        for (String i:palabrasinver){
            System.out.println(i);
        }
    }
}
