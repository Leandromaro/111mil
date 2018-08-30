/*
Crea una aplicación que dibuje una escalera de números, siendo cada línea números
empezando en uno y acabando en el número de la linea. Este es un ejemplo, si introducimos un
5 como altura:
1
12
123
1234
12345
*/

package segunda_guia_estructura_repetitiva_COMPLETA;
import java.util.Scanner;
public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner pant = new Scanner (System.in);
        System.out.println("ingrese altura");
        int altura=pant.nextInt();
        for (int x=1;x<=altura;x++){
            for (int i=1;i<=x;i++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    
}
