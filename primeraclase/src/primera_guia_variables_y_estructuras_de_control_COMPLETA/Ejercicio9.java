/*
algoritmo que encuentre la medida aritmetica y geometrica de 3 numeros ingresados
*/
package primera_guia_variables_y_estructuras_de_control_COMPLETA;
import java.util.Scanner;
public class Ejercicio9 {
    public static void main (String[]args){
        Scanner pant = new Scanner (System.in);
	System.out.println("ingrese 3 numeros");
	int a=pant.nextInt();
        int b=pant.nextInt();
        int c=pant.nextInt();
        System.out.println("medida aritmetica "+(a+b+c)/3);
        System.out.println("medida geometrica "+(a*b*c)/3);
    }
}
