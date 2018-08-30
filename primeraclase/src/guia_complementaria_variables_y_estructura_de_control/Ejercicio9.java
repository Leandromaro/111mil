/*
Se desea realizar un programa que clasifique un triángulo según sus lados.
*/
package guia_complementaria_variables_y_estructura_de_control;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner pant = new Scanner (System.in);
        int lado1, lado2, lado3;
        System.out.println("ingrese medida del lado 1");
        lado1=pant.nextInt();
        System.out.println("ingrese medida del lado 2");
        lado2=pant.nextInt(); 
        System.out.println("ingrese medida del lado 3");
        lado3=pant.nextInt();
        if (lado1==lado2 && lado1==lado3){
            System.out.println("triangulo equilatero");
        }
        else if (lado1==lado2 && lado1!=lado3 || lado1==lado3 && lado1!=lado2 || lado2==lado3 && lado2!=lado1){
            System.out.println("triangulo isoceles");
        }
        else{
            System.out.println("triangulo escaleno");
        }
    }
    
}
