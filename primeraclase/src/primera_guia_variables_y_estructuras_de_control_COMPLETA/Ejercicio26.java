package primera_guia_variables_y_estructuras_de_control_COMPLETA;
import java.util.Scanner;
public class Ejercicio26 {
public static void main (String[]args){
    Scanner pant = new Scanner (System.in);
    System.out.println("ingrese numero de horas trabajadas");
    int ganadoxhora=300, horas=pant.nextInt();
    System.out.println("su sueldo por trabajar "+horas+" hora/s es "+(ganadoxhora*horas));
}    
}
