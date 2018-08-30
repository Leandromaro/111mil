/*crear un arreglo con 10 posiciones con numero entre el 0 y el 9. 
Mostrar todas las posiciones del arreglo y la suma de todos los valores*/
package tercera_guia_arreglos_COMPLETA;



public class Ejercicio1 {

    public static void main(String[] args) {

        int[] a= new int[10];
        for (int x=0;x<(a.length);x++){
            a[x]=x;
            System.out.println("espacio "+x+" valor "+a[x]);
        }
    }
    
}
