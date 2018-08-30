/*
En una granja se requiere saber alguna información para determinar el precio de venta por cada 
kilo de huevo. Es importante determinar el promedio de calidad de las n gallinas que hay en la 
granja. La calidad de cada gallina se obtiene según la fórmula:  
calidad = peso de la gallina * altura de la gallina  / Numero de huevos que pone
*/
package segunda_guia_estructura_repetitiva_COMPLETA;
import java.util.Scanner;
public class Ejercicio29 {

    public static void main(String[] args) {
        Scanner pant = new Scanner (System.in);
        int cantidad, promedio=0, peso, huevos, altura, calidad;
        System.out.println("ingrese la cantidad de gallinas");
        cantidad=pant.nextInt();
        for (int x=cantidad;x>0;x--){
            System.out.println("ingrese el peso de la gallina en kilos");
            peso=pant.nextInt();
            System.out.println("ingrese altura de la gallina en centimetros");
            altura=pant.nextInt();
            System.out.println("ingrese la cantidad de huevos que pone");
            huevos=pant.nextInt();
            calidad=(peso*huevos)/altura;
            promedio+=calidad;
        }
        System.out.println("el promedio de calidad de las gallinas es "+promedio/cantidad);
    }
    
}
