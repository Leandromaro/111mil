package primera_guia_variables_y_estructuras_de_control_COMPLETA;
import java.util.Scanner;
public class diasdelasemana {
    public static void main (String[]args){
        Scanner pant = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int a=pant.nextInt();
        switch(a){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("martes");
                break;
                case 3:
                System.out.println("miercoles");
                break;
            case 4:
                System.out.println("jueves");
                break;
                case 5:
                System.out.println("viernes");
                break;
                case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("el numero ingresado no corresponde a ningun dia");
                break;
        }
    }
}
