/*
 pedir un numero entre 0 y 9999 y mostrarlo con las cifras al reves*/
package primera_guia_variables_y_estructuras_de_control_COMPLETA;
import java.util.Scanner;
public class Ejercicio14 {
    public static void main (String[]args){
        int numero=0,invertido=0,resto=0,resto2=0,resto3=0,resto4=0;
        Scanner pant = new Scanner (System.in);
        System.out.println("ingrese un numero");
        numero=pant.nextInt();
        String tamano=String.valueOf(numero);
        int falta=numero;
        if (4==tamano.length()){
            resto=falta%10;
            invertido=invertido*10+resto;
            falta=falta/10;
            resto2=falta%10;
            invertido=invertido*10+resto2;
            falta=falta/10;
            resto3=falta%10;
            invertido=invertido*10+resto3;
            falta=falta/10;
            resto4=falta%10;
            invertido=invertido*10+resto4;
            falta=falta/10;
            System.out.println("numero invertido:"+invertido);
        }
        else if (3==tamano.length()){
            resto=falta%10;
            invertido=invertido*10+resto;
            falta=falta/10;
            resto2=falta%10;
            invertido=invertido*10+resto2;
            falta=falta/10;
            resto3=falta%10;
            invertido=invertido*10+resto3;
            falta=falta/10;
            System.out.println("numero invertido:"+invertido);
    }
        else if (2==tamano.length()){
            resto=falta%10;
            invertido=invertido*10+resto;
            falta=falta/10;
            resto2=falta%10;
            invertido=invertido*10+resto2;
            falta=falta/10;
            System.out.println("numero invertido:"+invertido);
    }
        else if (1==tamano.length()){
            System.out.println("ingreso solo 1 cifra");
    }
        
    }
}
