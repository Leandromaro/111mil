/*
Generar una matriz de 5x5 donde la diagonal principal sea 0 y las demás
posiciones números aleatorios.
*/
package tercera_guia_arreglos_COMPLETA;
public class Ejercicio17 {
    public static void main(String[] args) {
        int fila=5, columna=5, matriz[][]=new int [fila][columna],cero=0, cont=0;
        for (int x=0;x<fila;x++){
            for (int i=0;i<columna;i++){
                if (i==cont){
                    matriz[x][i]=cero;
                }
                else{
                    matriz[x][i]=(int)((Math.random()*10)+1);
                }
            }
            cont++;
        }
        for (int x=0;x<fila;x++){ 
            for (int i=0;i<columna;i++){
                System.out.print(matriz[x][i]+" ");
            }
            System.out.println();
        }
    }
    
}
