/*
Generar una matriz de 5x5 con números aleatorios y contar la cantidad de
veces que aparece un número múltiplo de 2.
 */
package tercera_guia_arreglos_COMPLETA;

public class Ejercicio18 {

    public static void main(String[] args) {
        int fila=5, columna=5, matriz[][]=new int [fila][columna], cont=0;
        for (int x=0;x<fila;x++){
            for (int i=0;i<columna;i++){
                    matriz[x][i]=(int)(Math.random()*10);
            }
        }
        for (int x=0;x<fila;x++){ 
            for (int i=0;i<columna;i++){
                System.out.print(matriz[x][i]+" ");
                if (matriz[x][i]%2==0 && matriz[x][i]!=0){
                    cont++;
                }
            }
            System.out.println();
            
        }
        System.out.println("hay "+cont+" multiplos de 2");
    }
    
}
