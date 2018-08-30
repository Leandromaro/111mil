/*
Crear un arreglo con 10 posiciones con numero entre el 0 y 9. Buscar el primer
número que sea múltiplo de 2. Mostrar su contenido y su posición
*/
package cuarta_guia_ordenamiento_busqueda;

public class Ejercicio4 {

    public static void main(String[] args) {
        int vector[]= new int [10], cont=0, posicion=0;
        for (int x=0;x<vector.length;x++){
            vector[x]=(int)(Math.random()*9);
        }
        boolean encontrado=false;
        while (!encontrado && cont<vector.length){
            if (vector[cont]%2==0){
                encontrado=true;
                posicion=cont;
            }
            cont++;
        }
        if (encontrado){
            System.out.println("el numero es "+vector[posicion]+" y esta en la posicion "+posicion);
        }
    }
    
}
