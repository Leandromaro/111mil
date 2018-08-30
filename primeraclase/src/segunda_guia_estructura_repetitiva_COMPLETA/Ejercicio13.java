/*Al cerrar un expendio de naranjas, 15 clientes que aún no han pagado recibirán un 15% de
descuento si compran más de 10 kilos. Determinar cuanto pagara cada cliente y cuanto percibirá
la tienda por esas compras.
 */
package segunda_guia_estructura_repetitiva_COMPLETA;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner pant = new Scanner (System.in);
        int contClientes=0, precioxKg=20, perdida=0;
        boolean condicion=true;
        while (condicion){
            int montoPagar=0, descuento=0;
            System.out.println("peso de la compra");
            int peso=pant.nextInt();
            if (peso>10){
                montoPagar=peso*precioxKg;
                descuento=montoPagar-(int)(montoPagar*0.15);
                System.out.println("Usted tuvo un descuento, su monto a pagar es "+descuento);
                perdida=(int)(montoPagar*0.15)+perdida;
                contClientes++;
            }
            else{
                System.out.println("su monto a pagar es "+(peso*precioxKg));
            }
            if (contClientes==15){
                condicion=false;
            }
        }
        System.out.println("perdida en descuentos="+perdida);
    }
    
}
