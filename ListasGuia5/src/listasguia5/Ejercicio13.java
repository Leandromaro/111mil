//Escriba un programa que pida un número y a continuación escriba la lista de
//todos los números primos hasta él..
package listasguia5;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio13 {

    public static void main(String[] args) {
        int numprimo = 100;
        
        List <Integer> primos = new ArrayList();
        for (int x = 1; x <= numprimo; x++) {
            int cont=0;
            boolean primo = true;
            for (int i = 1; i <=x; i++) {
                if (x % i == 0) {
                    cont++;
                }
            }
            if (cont > 2) {
                primo = false;
            }
            if(primo && cont!=1){
                primos.add(x);
            }
        }
        System.out.println(primos);
    }

}
