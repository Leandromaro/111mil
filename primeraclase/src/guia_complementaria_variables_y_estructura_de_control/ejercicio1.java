/*
Elaborar un algoritmo que solicite el número de respuesta correctas, incorrectas y
en blanco, correspondientes a postulantes, y muestren su puntaje final
considerando 10 ptos si es correcta, -5 si es incorrecta y 0 si no contesto.
*/
package guia_complementaria_variables_y_estructura_de_control;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner pant = new Scanner (System.in);
        System.out.println("ingrese respuestas correctas");
        int correctas=pant.nextInt();
        System.out.println("ingrese respuestas incorrectas");
        int incorrectas=pant.nextInt();
        System.out.println("ingrese respuestas en blanco");
        int blancos=pant.nextInt();
        correctas=correctas*10;
        incorrectas=incorrectas*5;
        int blanco=0; blanco=blanco*0;
        int total=correctas-incorrectas+blanco;
        System.out.println("total="+total);
    }
    
}
