/*
Sabiendo la ecuación de distancia Velocidad * Tiempo se desea realizar un
programa que me calcule la distancia de un vehículo.
*/
package guia_complementaria_variables_y_estructura_de_control;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner pant = new Scanner (System.in);
        System.out.println("ingrese su velocidad");
        int velocidad=pant.nextInt();
        System.out.println("ingrese tiempo en horas");
        int tiempo=pant.nextInt();
        int distancia=velocidad*tiempo;
        System.out.println("su distancia es "+distancia+"Km");
    }
    
}
