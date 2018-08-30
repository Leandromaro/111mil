/*
Generar una matriz de 5x5 con números aleatorios no repetidos
 */
package tercera_guia_arreglos_COMPLETA;
public class Ejercicio19 {
    public static void main(String[] args) {
        int fila=5, columna=5;
        int arreglo[][] = new int [fila][columna], numero, contador=0, contador2=0;
        boolean bandera=true;
        while(bandera){
            boolean agregado=true;
            numero=(int)(Math.random()*(columna*fila))+1;
            for (int x=0;x<fila;x++){
                for ( int i=0;i<columna;i++){
                    if (numero==arreglo[x][i]){
                        agregado=false;
                    }
                }
            }
            if (agregado){
                arreglo[contador][contador2]=numero;
                contador2++;
                }
            if (contador2==5){
                contador++;
                contador2=0;
                if (contador==fila){
                    bandera=false;
                    }
            }
            
            }
        for (int x=0;x<fila;x++){ 
            for (int i=0;i<columna;i++){
                System.out.print(arreglo[x][i]+" ");
            }
            System.out.println();
        }
    }
    
}
