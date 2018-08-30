package primera_guia_variables_y_estructuras_de_control_COMPLETA;
import java.util.Scanner;
public class Ejercicio19 {
    public static void main (String[]args){
        Scanner pant = new Scanner(System.in);
        System.out.println("ingrese el precio del producto");
        int precio=pant.nextInt(), iva=21, ivar=0, resultado;
        ivar=(precio/100)*iva;
        resultado=precio+ivar;
        System.out.println("El precio con iva es "+resultado);
    }
}
