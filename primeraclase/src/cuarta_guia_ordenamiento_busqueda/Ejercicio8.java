/*
Crear un vector de la longitud ingresada por pantalla con valores aleatorios y
generar otro vector donde solamente se carguen aquello valores múltiplos de 2.
Ordenarlo de mayor a menor
*/
package cuarta_guia_ordenamiento_busqueda;
import ejercicios_en_clases.arrayHelpers;
import java.util.Scanner;
public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner pant = new Scanner (System.in);
        System.out.println("ingrese una longitud");
        int longitud=pant.nextInt(), vector[]=new int [longitud], long2=0;
        arrayHelpers.cargarRandom(vector);
        for (int x=0;x<longitud;x++){
            if (vector[x]%2==0){
                long2++;
            }
        }
    }
    
}
