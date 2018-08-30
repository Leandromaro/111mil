/*
pedir 2 numeros y mostrarlos ordenados de mayor a menor
*/
package primera_guia_variables_y_estructuras_de_control_COMPLETA;
import java.util.Scanner;
public class Ejercicio6 {
    public static void main (String[]args){
    Scanner pant = new Scanner (System.in);
		System.out.println("ingrese 2 numeros");
		int a=pant.nextInt();
		int b=pant.nextInt();
		if (a>b){
			System.out.println(a+";"+b);
		}
		else if (b>a){
			System.out.println(b+";"+a);
		}
		else{
			System.out.println("los numeros son iguales");
		}
		

	}
}
