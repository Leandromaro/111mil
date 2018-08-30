package primera_guia_variables_y_estructuras_de_control_COMPLETA;
import java.util.Scanner;
public class Ejercicio25 {
public static void main (String[]args){
    Scanner pant = new Scanner (System.in);
    System.out.println("ingrese su nombre");
    String nombre=pant.nextLine();
    System.out.println("primera nota");
    int n1=pant.nextInt();
    System.out.println("segunda nota");
    int n2=pant.nextInt();
    System.out.println("tercera nota");
    int n3=pant.nextInt();
    int promedio=n1+n2+n3;
    System.out.println(nombre+" su promedio es:"+(promedio/3));
}    
}
