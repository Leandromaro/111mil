/*
ingresar un numero del 0 al 99999 y mostar cuantas cifras tiene
 */
package guia_complementaria_variables_y_estructura_de_control;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner pant = new Scanner (System.in);
        int numero, Dmil, Umil, centena, decena, unidad, contCifras=0;
        System.out.println("ingrese un numero");
        numero=pant.nextInt();
        Dmil=numero/10000;
        Umil=numero/1000%10;
        centena=numero/100%10;
        decena=numero/10%10;
        unidad=numero%10;
        if (Dmil>0 && Dmil<=99999){
            System.out.println("decena de mil="+Dmil);
            contCifras++;
        }
        if (Umil>0){
            System.out.println("unidad de mil="+Umil);
            contCifras++;
        }
        else if (Umil==0 && numero/1000%10!=0){
            System.out.println("unidad de mil="+Umil);
            contCifras++;
        }
        if (centena>0){
            System.out.println("centena="+centena);
            contCifras++;
        }
        else if (centena==0 && numero/100%10!=0){
            System.out.println("centena="+centena);
            contCifras++;
        }
        if (decena>0){
            System.out.println("decena="+decena);
            contCifras++;
        }
        else if (decena==0 && numero/10%10!=0){
            System.out.println("decena="+decena);
            contCifras++;
        }
        if (unidad>0){
            System.out.println("unidad="+unidad);
            contCifras++;
        }
        else if (unidad==0){
            System.out.println("unidad="+unidad);
            contCifras++;
        }
        System.out.println("cantidad de cifras="+contCifras);
    }
    
}
