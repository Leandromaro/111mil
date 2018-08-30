/*
Crear un arreglo para cargar notas de 5 alumnos y cargarlas por teclado.
Mostrar cuál es la nota más baja y cuál la más alta
*/
package cuarta_guia_ordenamiento_busqueda;
import ejercicios_en_clases.arrayHelpers;
public class Ejercicio7 {

    public static void main(String[] args) {
        int longitud=5, vector[]=new int [longitud], mayor, menor;
        arrayHelpers.cargar(longitud, vector);
        mayor=vector[0];
        menor=vector[0];
        for (int x=0;x<longitud;x++){
            if (mayor<vector[x]){
                mayor=vector[x];
            }
            if (vector[x]<menor){
                menor=vector[x];
            }
        }
        System.out.println("la nota menor es "+menor);
        System.out.println("la nota mayor es "+mayor);
    }
    
}
