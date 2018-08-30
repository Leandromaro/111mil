/*
Un entrenador le ha propuesto a un atleta recorrer una ruta de cinco kilómetros durante 10 días,
para determinar si es apto para la prueba de 5 Kilómetros o debe buscar otra especialidad. Para
considerarlo apto debe cumplir por lo menos una de las siguientes condiciones:
a. Que en ninguna de las pruebas haga un tiempo mayor a 16 minutos.
b. Que al menos en una de las pruebas realice un tiempo mayor a 16 minutos.
c. Que su promedio de tiempos sea menor o igual a 15 minutos.
*/
package segunda_guia_estructura_repetitiva_COMPLETA;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner pant = new Scanner(System.in);
        boolean a=true, b=true, c=true;
        int cont=0, promedio, sumatiempo=0;
        for (int x=1; x<=10; x++){
            System.out.println("ingrese el timepo del dia"+x);
            int minutos=pant.nextInt();
            if (minutos>16){
                a=false;
            }
            if (minutos>16){
                cont++;
                if (cont>1){
                    b=false;
                }
            }
            sumatiempo=sumatiempo+minutos;
        }
        promedio=sumatiempo/10;
        if (promedio>16){
            c=false;
        }
        if (a){
            System.out.println("es apto");
        }
        else if (b){
            System.out.println("es apto");
        }
        else if (c){
            System.out.println("es apto");
        }
        else{
            System.out.println("no es apto");
        }
    }
    
}
