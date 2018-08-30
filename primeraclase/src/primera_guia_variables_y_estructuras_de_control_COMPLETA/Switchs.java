package primera_guia_variables_y_estructuras_de_control_COMPLETA;
import java.util.Scanner;
public class Switchs {
   public static void main(String[] args) {
       Scanner pant = new Scanner (System.in);
       System.out.println("ingrese nuemero A");
       double a=pant.nextDouble();
       System.out.println("ingrese numero B");
       double b=pant.nextDouble();
       System.out.println("que operacion desea hacer:\n1.suma\n2.resta\n3.multiplicacion\n4.divicion");
       int c=pant.nextInt();
       
       switch (c){
           case 1:
               double rsum=a+b;
               System.out.println(rsum);
               break;
           case 2:
               double resta=a-b;
               System.out.println(resta);
               break;
           case 3:
               double multi=a*b;
               System.out.println(multi);
               break;
           case 4:
               double div=a/b;
               System.out.println(div);
               break;
           default:
               System.out.println("no hay caso correcto");
               break;
               }
   }
   
}