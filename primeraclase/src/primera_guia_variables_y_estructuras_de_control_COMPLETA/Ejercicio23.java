package primera_guia_variables_y_estructuras_de_control_COMPLETA;
import java.util.Scanner;
public class Ejercicio23 {
public static void main (String[]args){
    double base, altura;
    Scanner pant = new Scanner(System.in);
    System.out.println("ingrese la base del triangulo");
    base=pant.nextDouble();
    System.out.println("ingrese la altura del triangulo");
    altura=pant.nextDouble();
    System.out.println("El area del triangulo ingresado es:"+((base*altura)/2));
}    
}
