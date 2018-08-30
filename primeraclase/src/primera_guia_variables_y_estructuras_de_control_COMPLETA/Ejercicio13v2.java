package primera_guia_variables_y_estructuras_de_control_COMPLETA;
import java.util.Scanner;
public class Ejercicio13v2 {
public static void main (String[]args){
    Scanner pant = new Scanner (System.in);
    System.out.println("ingrese un numero entre 0 y 9999");
    int b=pant.nextInt(),cont=1;
    boolean a=true;
    while(a){
        b=b/10;
        if (b>0){
            cont++;    
        }
        else if(b==0){
            a=false;
        }
    }
    System.out.println("el numero tiene "+cont+" cifras");
}

}
