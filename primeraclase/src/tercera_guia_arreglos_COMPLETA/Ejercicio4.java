/*
cargar un arreglo de 100 posiciones con numeros aleatorios y mostar solamente
aquellos que sean multiplos de 2
 */
package tercera_guia_arreglos_COMPLETA;

public class Ejercicio4 {
    public static void main(String[] args) {
        int a[]= new int[100];
        for (int x=0;x<(a.length);x++){
            a[x]=(int)(Math.random()*100)+1;
            if (a[x]%2==0){
                System.out.println(a[x]);
            }
        }
    }
    
}
