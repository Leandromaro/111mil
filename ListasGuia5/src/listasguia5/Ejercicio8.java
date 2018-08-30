package listasguia5;
//Escriba un programa que permita crear una lista de palabras y que, a continuación,
//ordene la lista por orden alfabético

import java.util.ArrayList;
import java.util.List;

public class Ejercicio8 {

    public static void main(String[] args) {
        List<String> palabras = new ArrayList();
        palabras.add("Guido");
        palabras.add("Gonza");
        palabras.add("Gabriel");
        String aux;
        System.out.println("lista");
        
        for (String i : palabras) {
            System.out.println(i);
        }
        for (int i=0;i<palabras.size();i++){
            for (int x=i;x<palabras.size();x++){
                if ((palabras.get(i).compareTo(palabras.get(x)))>0){
                    aux=palabras.get(i);
                    palabras.set(i, palabras.get(x));
                    palabras.set(x, aux);
                }
            }
        }
        System.out.println("lista ordenada");
        for (String i:palabras){
            System.out.println(i);
        }
    }

}
