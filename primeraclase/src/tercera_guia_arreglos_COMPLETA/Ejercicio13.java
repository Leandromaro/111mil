/*Crear un vector de 20 numeros reales correspondientes a los pesos 
de 20 personas. Obtener el peso mayor, el menor y el peso medio y visualizar
si hay alguna persona con un peso mayor de 100 kg.
 */
package tercera_guia_arreglos_COMPLETA;
import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner pant = new Scanner (System.in);
        int persona=0;
        double vectorPesos[]=new double [20], pesoMayor=0, pesoMenor=500, sumaPesos=0, promedioPesos;
        for(int i=0;i<vectorPesos.length;i++){
            System.out.println("ingrese su peso");
            double peso=pant.nextDouble();
            if (peso>pesoMayor){
                pesoMayor=peso;
            }
            if (peso<pesoMenor){
                pesoMenor=peso;
            }
            if (peso>100){
                persona++;
            }
            sumaPesos=sumaPesos+peso;
        }
        promedioPesos=sumaPesos/vectorPesos.length;
        System.out.println("el promedio de los pesos es "+promedioPesos);
        System.out.println("el peso mayor es "+pesoMayor);
        System.out.println("el peso menor es "+pesoMenor);
        System.out.println("hay "+persona+" persona/s con 100kg");
    }
}
