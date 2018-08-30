/*
Realizar un programa que le pida al usuario un número entero de 4 cifras y le
devuelva el mismo número escrito al revés. (Ejemplo: El número 3518 devolvería 8153).
 */
package guia_complementaria_arreglos;
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner pant = new Scanner(System.in);
        System.out.println("ingrese un numero de 4 cifras");
        int numero = pant.nextInt();
        String cadena = Integer.toString(numero);
        char[] caracteres = cadena.toCharArray();
        char[] caracteresI = new char [caracteres.length];
        int cont=0;
        for (int x=caracteresI.length-1; x>=0;x--){
            caracteresI[x]=caracteres[cont];
            cont++;
        }
        for (int x=0;x<caracteresI.length; x++){
            System.out.print(caracteresI[x]);
        }
    }
}
