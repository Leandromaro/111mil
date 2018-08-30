package primera_guia_variables_y_estructuras_de_control_COMPLETA;
import java.util.Scanner;
public class Ejercicio22 {
public static void main (String[]args){
    Scanner pant = new Scanner (System.in);
    System.out.println("ingrese un lado del cuadrado");
    double area=pant.nextDouble();
    System.out.println("El area del cuadrado ingresado es:"+(area*area));
}    
}
