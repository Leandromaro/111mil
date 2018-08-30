/*
Diseñe un programa para obtener el grado de eficiencia de un operario de una fábrica de
tornillos, de acuerdo a las siguientes condiciones, que se le imponen para un período de
prueba:
a. Menos de 200 tornillos defectuosos.
b. Más de 10000 tornillos producidos.
c. El grado de eficiencia se determina de la siguiente manera:
i. Si no cumple ninguna de las condiciones, grado 5.
ii. Si sólo cumple la primera condición, grado 6.
iii. Si sólo cumple la segunda condición, grado 7.
iv. Si cumple las dos condiciones, grado 8.
*/
package guia_complementaria_variables_y_estructura_de_control;
import java.util.Scanner;
public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner pant = new Scanner (System.in);
        int defectuosos, producidos, a=200, b=1000; 
        boolean defectuososB=true, producidosB=true;
        System.out.println("ingrese cantidad de tornillos defectuosos");
        defectuosos=pant.nextInt();
        System.out.println("ingrese cantidad de tornillos producidos");
        producidos=pant.nextInt();
        if (defectuosos<a){
            defectuososB=false;
        }
        if (producidos>b){
            producidosB=false;
        }
        if (!defectuososB && !producidosB){
            System.out.println("grado 8");
    }
        else if (defectuososB && !producidosB){
            System.out.println("grado 7");
        }
        else if (!defectuososB && producidosB){
            System.out.println("grado 6");
        }
        else if (defectuososB && producidosB){
            System.out.println("grado 5");
        }
    }
    
}
