/*
La presión, volumen y temperatura de una masa de aire se relacionan por la fórmula:
masa= presión * volumen
0.37 * (temperatura + 460)
Calcular el promedio de masa de aire de los neumáticos de n vehículos que están en
compostura en un servicio de alineación y balanceo. Los vehículos pueden ser motocicletas o
automóviles. 
*/
package segunda_guia_estructura_repetitiva_COMPLETA;
import java.util.Scanner;
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner pant = new Scanner (System.in);
        int cantidad;
        double presion, volumen, temperatura, masa, masatotal=0;
        System.out.println("cuantos vehiculos hay");
        cantidad=pant.nextInt();
        for (int x=cantidad;x>0;x++){
            System.out.println("ingrese presion");
            presion=pant.nextDouble();
            System.out.println("ingrese volumen");
            volumen=pant.nextDouble();
            System.out.println("ingrese temperatura");
            temperatura=pant.nextDouble();
            masa=((presion*volumen)/(0.37*(temperatura+460)));
            masatotal+=masa;
        }
        System.out.println("el promedio de la masa de los vehiculos presentes "+masatotal/cantidad); 
    }
    
}
