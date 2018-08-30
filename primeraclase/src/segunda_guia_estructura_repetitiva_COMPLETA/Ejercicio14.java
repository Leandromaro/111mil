/*
En un centro de verificación de automóviles se desea saber el promedio de puntos
contaminantes de los primeros 25 automóviles que lleguen. Asimismo se desea saber los puntos
contaminantes del carro que menos contamino y del que más contaminó.
*/
package segunda_guia_estructura_repetitiva_COMPLETA;
import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner pant = new Scanner (System.in);
        int sumaPuntos=0, mayorPunto=0, menorPunto=99999, autoMa=0, autoMe=0;
        for (int x=1; x<26;x++){
            System.out.println("ingrese puntos contaminantes");
            int puntos=pant.nextInt();
            sumaPuntos=puntos+sumaPuntos;
            if (puntos>mayorPunto){
                mayorPunto=puntos;
                autoMa=x;
            }
            if (puntos<menorPunto){
                menorPunto=puntos;
                autoMe=x;
            }
        }
        System.out.println("promedio de contaminacion "+(sumaPuntos/25));
        System.out.println("auto Nº"+autoMa+" tiene la mayor cantaminacion ("+mayorPunto+")");
        System.out.println("auto Nº"+autoMe+" tiene la menor cantaminacion ("+menorPunto+")");
    }
    
}
