/*Generar un arreglo con numero aleatorios no repetidos entre si
 */
package tercera_guia_arreglos_COMPLETA;
public class Ejercicio14 {
    public static void main(String[] args) {
        int limiteVector=15;
        int arreglo[] = new int [limiteVector], numero, contador=0;
        boolean bandera=true;
        while(bandera){
            boolean agregado=true;
            numero=(int)(Math.random()*limiteVector)+1;
            for (int x=0;x<arreglo.length;x++){
                if (numero==arreglo[x]){
                    agregado=false;
                }
            }
            if (agregado){
                arreglo[contador]=numero;
                contador++;
                if (contador==arreglo.length){
                    bandera=false;
                    }
                }
            
            }        
        for (int i=0;i<arreglo.length;i++){
            System.out.println(arreglo[i]);
        }
        }
    }
    

