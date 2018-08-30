package primera_guia_variables_y_estructuras_de_control_COMPLETA;
import java.util.Scanner;
public class Ejercicio21 {
public static void main (String[]args){
    Scanner pant = new Scanner(System.in);
    System.out.println("ingrese el area del circulo");
    double radio=pant.nextDouble();
    double elevar=(Math.pow(radio, 2))*Math.PI;
    System.out.println("El area del circulo ingresado es de:"+elevar);
}    
}
