/*
Ingresar un Nº por teclado e indicar si es par o impar
*/
package primera_guia_variables_y_estructuras_de_control_COMPLETA;
import java.util.Scanner;
public class Ejercicio7 {
    public static void main (String[]args){
        Scanner pant = new Scanner (System.in);
		System.out.println("ingrese un numero");
		int a=pant.nextInt();
                if (a%2==0){
                    System.out.println("el numero ingresado es par");
                }
                else{
                    System.out.println("el numero ingresado es impar");
                }
    }
}
