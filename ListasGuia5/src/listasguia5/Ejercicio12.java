// Escriba un programa que pida un número y a continuación escriba la lista de
//todos los divisores del número (incluidos el uno y él mismo).
package listasguia5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner pant = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int num=pant.nextInt();
        List <Integer> numeros = new ArrayList();
        for(int i=1; i<=num;i++){
            if (num%i==0){
                numeros.add(i);
            }
        }
        System.out.println("los divisores de este numero son:");
        for (int i:numeros){
            System.out.println(i);
        }
    }
    
}
