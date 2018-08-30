/*
Generar una matriz de 5x5 donde la diagonal principal sea 0 y arriba de
la diagonal solamente deben ir numeros pares no repetidos, abajo de la diagonal
deben ir numeros impares no repetidos 
 */
package tercera_guia_arreglos_COMPLETA;
public class Ejercicio20 {
    public static void main(String[] args) {
        int fila=5, columna=5, numeropar=0, numero=0, numeroimpar=0;
        int matriz[][]=new int [fila][columna];
        boolean condicion=true;
        
        for (int x=0; x<fila; x++){
            int cont=0;
            for (int i=0; i<columna; i++){
                if (x==i){
                    matriz[x][i]=0;
                    }
            }
        }
        for (int x=0; x<fila; x++){
            int cont=0;
            for (int i=0; i<columna; i++){
                boolean agregado=true;
                boolean par=true;
                if (x<i){
                    while(par){
                    numero=(int)(Math.random()*(columna*fila))+1;
                    if (numero%2==0){
                        par=false;
                        numeropar=numero;
                    }
                    }
                    for (int z=0;z<fila;z++){
                        for ( int y=0;y<columna;y++){
                            if (numeropar==matriz[z][y]){
                                agregado=false;
                                i--;
                            }
                        }       
                    }
                    if (agregado){
                                matriz[x][i]=numeropar;
                    }
                }
            }
        }
        for (int x=0; x<fila; x++){
            int cont=0;
            for (int i=0; i<columna; i++){
                boolean impar=true, agregado2=true;
                if (x>i){
                    while(impar){
                    numero=(int)(Math.random()*(columna*fila))+1;
                    if (numero%2==1){
                        impar=false;
                        numeroimpar=numero;
                    }
                    }
                    for (int z=0;z<fila;z++){
                        for ( int y=0;y<columna;y++){
                            if (numeroimpar==matriz[z][y]){
                                agregado2=false;
                                i--;
                            }
                        }       
                    }
                    if (agregado2){
                                matriz[x][i]=numeroimpar;
                    }
                    }
            }
        }
        for (int x=0; x<fila; x++){
            for (int i=0; i<columna; i++){
                System.out.print(matriz[x][i]+" ");
            }
            System.out.println();
        }
    }
}
