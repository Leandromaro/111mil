/*
Que lea 5 números por teclado, los copie a otro array multiplicados por 2 y los
muestre todos ordenados usando un tercer array
*/
package guia_complementaria_arreglos;
import ejercicios_en_clases.arrayHelpers;
public class Ejercicio2 {
    public static void main(String[] args) {
        int longitud=5, vector[]= new int [longitud], vectorM[]= new int [longitud], vectorO[]=new int [longitud];
        //cargamos el vector mediante metodos
        arrayHelpers.cargar(longitud, vector);
        //mostramos el vector desordenado
        System.out.println("vector cargado:");
        arrayHelpers.mostrar(vector);
        System.out.println();
        //cargamos un segundo vector (vectorM) con los valores del primero multiplicados por 2
        for (int x=0;x<longitud;x++){
            vectorM[x]=vector[x]*2;
        }
        //cargamos los valores del vectorM a un tercer vector (vectorO)
        for (int x=0;x<longitud;x++){
            vectorO[x]=vectorM[x];
        }
        System.out.println("vector multiplicado por 2");
        //mostramos el vector con los valores multiplicados
        arrayHelpers.mostrar(vectorM);
        System.out.println();
        //ordenamos el vectorO
        arrayHelpers.ordenar(vectorO);
        //mostramos el vectorO ordenado
        System.out.println("vector ordenado");
        arrayHelpers.mostrar(vectorO);
        System.out.println();
    }
}
