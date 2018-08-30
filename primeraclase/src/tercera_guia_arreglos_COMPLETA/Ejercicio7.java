/* Dado un arreglo de 10 posiciones con notas de los alumnos, el cual esta
compuesto de valores como: "Malo, Regular, Bueno, Muy Bueno, Exelente"
cargar otro arreglo con la misma cantidad de posiciones con sus equivalentes
en enteros
 */
package tercera_guia_arreglos_COMPLETA;
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner pant = new Scanner (System.in);
        String notas[]={"malo","malo","regular","regular","bueno","bueno","exelente","exelente","perfecto","perfecto"};  
        int notasInt[] = new int [10]; 
        for (int i=0;i<notas.length;i++){
            if (notas[i]=="malo"){
                notasInt[i]=2;
            }
            if (notas[i]=="regular"){
                notasInt[i]=4;
            }
            if (notas[i]=="bueno"){
                notasInt[i]=6;
            }
            if (notas[i]=="exelente"){
                notasInt[i]=8;
            }
            if (notas[i]=="perfecto"){
                notasInt[i]=10;
            }
        }
        for (int i=0;i<notasInt.length;i++){
            System.out.println("notas "+notasInt[i]+" valores "+notas[i]);
        }
        
    }
    
}
