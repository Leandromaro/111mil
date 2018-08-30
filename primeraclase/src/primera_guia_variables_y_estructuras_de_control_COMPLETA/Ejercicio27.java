package primera_guia_variables_y_estructuras_de_control_COMPLETA;
import java.util.Scanner;
public class Ejercicio27 {
public static void main (String[]args){
    Scanner pant = new Scanner (System.in);
    System.out.println("ingrese un caracter");
    char caracter=pant.next().charAt(0);
    if (caracter!='a' && caracter!='e' && caracter!='i' && caracter!='o' && caracter!='u'){
        System.out.println("el caracter ingresado es una vocal");
    }
    else {
        System.out.println("el caracter ingresado es una consonante");
    }
}    
}
