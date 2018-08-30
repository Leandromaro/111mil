/*
leer un numero de 3 cifras y mostrar por separado las cifras del numero
sin perder el numero ingresado
*/
package primera_guia_variables_y_estructuras_de_control_COMPLETA;
import java.util.Scanner;
public class Ejercicio18 {
    public static void main (String[]args){
        int numero=0,resto=0,resto2=0,resto3=0;
        Scanner pant = new Scanner(System.in); 
        System.out.println("ingrese un numero");
        numero=pant.nextInt();
        int falta=numero;
        resto=falta%10;
        falta=falta/10;
        resto2=falta%10;
        falta=falta/10;
        resto3=falta%10;
        falta=falta/10;
        System.out.println("valor1:"+resto);
        System.out.println("valor2:"+resto2);
        System.out.println("valor3:"+resto3);
    }
}

