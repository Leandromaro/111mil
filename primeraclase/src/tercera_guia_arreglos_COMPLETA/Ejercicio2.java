/*crear un areeglo con 10 posiciones con numeros entre el 0 y 9
Mostrar en pantalla solamente los numerops que sean multiplos de 2
 */
package tercera_guia_arreglos_COMPLETA;

public class Ejercicio2 {

    public static void main(String[] args) {
     int[] a= new int[10];
        for (int x=0;x<(a.length);x++){
            a[x]=x;
            if (a[x]%2==0){
            System.out.println("espacio "+x+" valor "+a[x]);}
        }   
    }
    
}
