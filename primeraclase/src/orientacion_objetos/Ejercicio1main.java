/*crear un arreglo de 10 personas y ordenarlos por edad, mostrar persona con
la edad mas chica y la mas grande
*/
package orientacion_objetos;

import java.util.Scanner;

public class Ejercicio1main {

    public static void main(String[] args) {
        Scanner pant = new Scanner (System.in);
        int aux, aux2;
        String auxS, aux2S;
        Ejercicio1[] vector= new Ejercicio1 [10];
        for (int x=0;x<vector.length;x++){
            String nombre=pant.next();
            int edad=pant.nextInt();
            vector[x]= new Ejercicio1(edad,nombre);
        }
        for (int x=0;x<vector.length;x++){
            for (int i=0;i<vector.length;i++){
                if(vector[x].getEdad()<vector[i].getEdad()){
                    auxS=vector[x].getNombre();
                    aux=vector[x].getEdad();
                    aux2=vector[i].getEdad();
                    aux2S=vector[i].getNombre();
                    vector[x] = new Ejercicio1(aux2,aux2S);
                    vector[i] = new Ejercicio1(aux, auxS);
                }
            }
        }
        System.out.println("printeada pa");
        for (int x=0;x<vector.length;x++){
            System.out.print(vector[x].getNombre());
            System.out.println(vector[x].getEdad());
            
        }
    }
    
}
