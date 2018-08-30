/* Crear un arreglo de 100 posiciones
que contrendra los numeros del 1 al 100. obtener la suma de todos ellos 
y el promedio
 */
package tercera_guia_arreglos_COMPLETA;

public class Ejercicio3 {

    public static void main(String[] args) {
        int a[]= new int[100], suma=0;
        for (int x=0;x<(a.length);x++){
            a[x]=x+1;
            suma=(a[x])+suma;
        }
        System.out.println("suma de todos los numero "+suma);
        System.out.println("el promedio es "+(suma/(a.length)));
    }
    
}
