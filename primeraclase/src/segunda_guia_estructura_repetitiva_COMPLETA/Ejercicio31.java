/*
 Suponga que tiene usted una tienda y desea registrar las ventas en su computadora. 
Diseñe un programa en Java que lea por cada cliente, el monto total de su compra. 
Al final del día que escriba la cantidad total de ventas y el número de clientes atendidos. 
 */
package segunda_guia_estructura_repetitiva_COMPLETA;
import java.util.Scanner;
public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner pant = new Scanner (System.in);
        int opcion, venta, contClientes=0, totalVenta=0;
        boolean bandera=true;
        while(bandera){
            System.out.println("tiene clientes por atender?\n1=si\n2=no");
            opcion=pant.nextInt();
            if (opcion==1){
                contClientes++;
                System.out.println("cliente "+contClientes+"\ningrese total de su compra");
                venta=pant.nextInt();
                totalVenta+=venta;
            }
            else if (opcion==2){
                bandera=false;
            }
        }
        System.out.println("el monto total de las ventas realizadas hoy es de $"+totalVenta);
        System.out.println("la cantidad de clientes atendidos fue "+contClientes);
    }
    
}
