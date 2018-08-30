/* Calcular la suma siguiente: 100 + 98 + 96 + 94 +. . . + 0 en este orden 
*/
package segunda_guia_estructura_repetitiva_COMPLETA;

public class Ejercicio7 {

    public static void main(String[] args) {
        int suma=100;
        for (int x=98;x>=0;x--){
            if (x%2==0){
                System.out.println(suma+" + "+x);
                suma=suma+x; 
            }   
        }
    }
}
