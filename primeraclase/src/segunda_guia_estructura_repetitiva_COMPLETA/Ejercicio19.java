/*
En una tienda de descuento las personas que van a pagar el importe de su compra llegan a la
caja y sacan una bolita de color, que les dirá que descuento tendrán sobre el total de su compra.
Determinar la cantidad que pagara cada cliente desde que la tienda abre hasta que cierra. Se
sabe que si el color de la bolita es rojo el cliente obtendrá un 40% de descuento; si es amarillo un
25% y si es blanca no obtendrá descuento. 
*/
package segunda_guia_estructura_repetitiva_COMPLETA;
import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner pant = new Scanner (System.in);
        boolean clientes=true;
        int totalDescuento=0;
        while(clientes){
            System.out.println("ingrese el color de su pelota\nAmarillo=1\nRojo=2\blanca=3");
            int color=pant.nextInt();
            System.out.println("ingrese monto de su compra");
            int compra=pant.nextInt();
            if (color==1){
                int descuento=(int)(compra*0.25);
                int precioPagar=compra-descuento;
                System.out.println("debe pagar $"+precioPagar);
                totalDescuento=totalDescuento+descuento;
            }
            else if (color==2){
                int descuento=(int)(compra*0.25);
                int precioPagar=compra-descuento;
                System.out.println("debe pagar $"+precioPagar);
                totalDescuento=totalDescuento+descuento;
            }
            else if (color==3){
                System.out.println("no tiene descuento, su valor a pagar es $"+compra);
            }
            System.out.println("hay mas clientes? si=1 no=0");
            int opcion=pant.nextInt();
            if (opcion==0){
                clientes=false;
            }
        }
    }
    
}
