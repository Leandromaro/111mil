/*
Una frutería ofrece las manzanas con descuento según la siguiente tabla: 
NUM. DE KILOS COMPRADOS % DESCUENTO 
compta<2 0 
2<compra>3 15 
3<compra>3.5 20 
3.5<compra 25 
Determinar cuanto pagara una persona que compre manzanas es esa frutería.
*/
package guia_complementaria_variables_y_estructura_de_control;
import java.util.Scanner;
public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner pant = new Scanner (System.in);
        double kilos, precio, total;
        System.out.println("ingrese cantidad de kilos");
        kilos=pant.nextDouble();
        System.out.println("ingrese precio por kilo");
        precio=pant.nextDouble();
        total=kilos*precio;
        if (kilos<2){
            System.out.println("usted debe pagar $"+total);
        }
        else if (kilos>2 && kilos<3){
            System.out.println("usted debe pagar $"+((total*0.15)+total));
        }
        else if (kilos>3 && kilos<3.5){
            System.out.println("usted debe pagar $"+((total*0.20)+total));
        }
        else if (kilos>3.5){
            System.out.println("usted debe pagar $"+((total*0.25)+total));
        }
    }
    
}
