package primera_guia_variables_y_estructuras_de_control_COMPLETA;
import java.util.Scanner;
public class Ejercicio20 {
public static void main (String[]args){
        Scanner pant = new Scanner(System.in);
        System.out.println("ingrese el precio del producto");
        int precio=pant.nextInt(), iva=21, ivar=0, resultado, cantidad, multi;
        System.out.println("ingrese cuantos va a llevar");
        cantidad=pant.nextInt();
        multi=precio*cantidad;
        ivar=(multi/100)*iva;
        resultado=multi+ivar;
        System.out.println("El precio con iva es "+resultado);
        System.out.println("El precio sin iva es "+multi);
}    
}
