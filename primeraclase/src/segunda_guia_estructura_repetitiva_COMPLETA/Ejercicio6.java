/*Construir un programa que calcule y visualice por pantalla el factorial 
de todos los valores numéricos enteros entre 1 y 10.
 */
package segunda_guia_estructura_repetitiva_COMPLETA;
public class Ejercicio6 {
    public static void main(String[] args) {
        int x=1;
        while(x<=10){
            int factorial=1;
            for(int i=1;i<=x;i++){
                factorial=factorial*i;
            }
            System.out.println("factorial de "+x+" es "+factorial);
            x++;
        }
    }
    
}
