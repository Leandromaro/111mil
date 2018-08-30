/*Elaborar un programa que muestre los números pares 
comprendidos entre 10 y 20 inclusive
 */
package segunda_guia_estructura_repetitiva_COMPLETA;
public class Ejercicio4 {
    public static void main(String[] args) {
        for(int x=10;x<=20;x++){
            if (x%2==0){
                System.out.println(x);
            }
        }
    }
    
}
