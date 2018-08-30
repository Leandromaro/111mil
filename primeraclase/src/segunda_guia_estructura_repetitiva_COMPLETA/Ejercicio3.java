/*permita la carga de 10 valores por teclado y nos muestre
posteriormente la suma de los valores ingresados y su promedio
*/
package segunda_guia_estructura_repetitiva_COMPLETA;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner pant = new Scanner (System.in);
        int numero, suma=0;
        for(int x=0;x<10;x++){
            System.out.println("ingrese un numero");
            numero=pant.nextInt();
            suma=suma+numero;
        }
        System.out.println("la suma de los numeros es "+suma+"\nel promedio es "+(suma/10));
    }
    
}
