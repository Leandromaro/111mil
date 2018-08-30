/*
pedir un numero entre 0 y 9999 y mostrarlo con las cifras al reves
*/
package primera_guia_variables_y_estructuras_de_control_COMPLETA;
import java.util.Scanner;
public class Ejercicio14arreglo {
    public static void main (String[]args){
        Scanner pant = new Scanner (System.in);
        /*
        int paso=Integer.parseInt();
        String pasoo=Integer.toString();
        */
        System.out.println("ingrese un numero");
        int numero = pant.nextInt(); 
        String num = String.valueOf(numero); 
        String numeroinver=""; 
        String a=""; 
        char num2 [] = num.toCharArray(); 
        for(int i=(num.length())-1;i>=0;i--) { 
            System.out.println(num2[i]);
            a=Character.toString(num2[i]); 
            numeroinver = numeroinver.concat(a);
        } 
        int numerofinal = Integer.parseInt(numeroinver); 
        System.out.println(numerofinal); 
    } 
}

