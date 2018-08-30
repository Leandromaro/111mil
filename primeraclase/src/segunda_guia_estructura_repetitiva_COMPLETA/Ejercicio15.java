/*
Una compañía de seguros tiene contratados a n vendedores. Cada uno hace tres ventas a la
semana. Su política de pagos es que un vendedor recibe un sueldo base, y un 10% extra por
comisiones de sus ventas. El gerente de su compañía desea saber cuánto dinero obtendrá en la
semana cada vendedor por concepto de comisiones por las tres ventas realizadas, y cuanto
tomando en cuenta su sueldo base y sus comisiones.
 */
package segunda_guia_estructura_repetitiva_COMPLETA;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner pant=new Scanner (System.in);
        int cantidadVendedores, sueldoBase=1000; 
        System.out.println("ingrese cuantos vendedores tiene");
        cantidadVendedores=pant.nextInt();
        DecimalFormat formato = new DecimalFormat("#.##");
        for (int x=1; x<cantidadVendedores+1;x++){
            double venta=0, sumaVenta=0;
            for (int i=1;i<4;i++){
                System.out.println("ingrese venta Nº"+i+" del vendedorNº"+x);
                venta=pant.nextInt();
                sumaVenta=venta+sumaVenta;
            }
            double comision=sumaVenta*0.10;
            System.out.println("el vendedorNº"+x+" tiene una comision de "+formato.format(comision));
            System.out.println("el sueldo total del vendedor es "+formato.format(sueldoBase+comision));
            System.out.println();
        }
    }
    
}
