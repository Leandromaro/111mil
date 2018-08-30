/*
BusquedacentinelaCargarNOrepetidos_Ordenar_BusquedaBinaria
*/
package ejercicios_en_clases;

import java.util.Scanner;

public class Ejercicio14_guiaarreglos_reformulado {
    public static void main(String[] args) {
        //CARGAR RANDOM NO REPETIDO CON BUSCQUEDA CENTINELA
        Scanner pant = new Scanner (System.in);
        int limiteVector=10;
        int arreglo[] = new int [limiteVector], numero, contador=0;
        boolean bandera=true;
        while(bandera){
            boolean agregado=true;
            numero=(int)(Math.random()*limiteVector*2)+1;
            int cont=0;
            while (agregado && cont<limiteVector){
                if (numero==arreglo[cont]){
                    agregado=false;
                }
                cont++;
            }
            if (agregado){
                arreglo[contador]=numero;
                contador++;
                if (contador==arreglo.length){
                    bandera=false;
                    }
                }
            }
        //ORDENAMIENTO 
        for (int i=1; i < limiteVector; i++) {
            int aux = arreglo[i];
            int j;
            for (j=i-1; j >= 0 && arreglo[j] > aux; j--){
                arreglo[j+1] = arreglo[j];
                }    
            arreglo[j+1] = aux;
            }
        System.out.println("ingrese un numero entero");
        // BUSQUEDA BINARIA
        int buscado=pant.nextInt();
        int inf=0;
        int sup=limiteVector;
        int centro;
        int posicion=0;
        boolean encontro=false;
        while (!encontro && inf<=sup){
            centro = ((sup-inf)/2)+inf;
            if (arreglo[centro]==buscado){
                encontro=true;
                posicion=centro;
            }
            else if (arreglo[centro]>buscado){
                sup = centro-1;
            }
            else{
                inf = centro+1;
            }
        }
        if (encontro){
            System.out.println("se encontro el elemnto "+buscado+" en la posicion "+posicion);
        }
        else {
            System.out.println("no se encontro el elemento que busca");
        }
        for (int i=0;i<arreglo.length;i++){
            System.out.print(arreglo[i]+" ");
        }
        System.out.println();
    }
}