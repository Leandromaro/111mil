/*Se ingresan un conjunto de n edades de personas por teclado. 
El programa finalizará cuando el promedio de las edades sea superior a 25.
*/
package segunda_guia_estructura_repetitiva_COMPLETA;
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner pant = new Scanner (System.in);
        int contadorIngresos=0, sumaEdades=0, promedio;
        boolean condicion=true;
        while(condicion){
            System.out.println("ingrese una edad");
            int edad=pant.nextInt();
            contadorIngresos++;
            sumaEdades=sumaEdades+edad;
            if (contadorIngresos>2){
                promedio=sumaEdades/contadorIngresos;
                System.out.println("promedio de edades "+promedio);
                if (promedio>25){
                    condicion=false;
                }
            }
        }
    }
}
