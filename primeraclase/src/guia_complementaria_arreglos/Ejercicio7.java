/*
Dado un arreglo A de n números enteros, se pide obtener los arreglos B y C a
partir del arreglo A. En el arreglo B se deben poner los números pares y en el
arreglo C se deben poner los números impares
 */
package guia_complementaria_arreglos;

import ejercicios_en_clases.arrayHelpers;

public class Ejercicio7 {

    public static void main(String[] args) {
        int contPares = 0, contImpares = 0, longitud = 10, vectorA[] = new int[longitud];
        arrayHelpers.cargarRandom(vectorA);
        //vemos cuantos numeros impares y pares hay para definir el tamaño de los vectores B y C
        for (int x : vectorA) {
            if (x % 2 == 0) {
                contPares++;
            } else {
                contImpares++;
            }
        }
        int vectorB[] = new int[contPares], vectorC[] = new int[contImpares];
        //cargamos vector B
        int cont1=0, cont2=0;
        while (cont1<longitud){
            if (vectorA[cont1]%2==0){
                vectorB[cont2]=vectorA[cont1];
                cont2++;
                cont1++;
            }
            else{
                cont1++;
            }
        }
        //cargamos vector C
        int cont3=0, cont4=0;
        while (cont3<longitud){
            if (vectorA[cont3]%2!=0){
                vectorC[cont4]=vectorA[cont3];
                cont4++;
                cont3++;
            }
            else{
                cont3++;
            }
        }
        arrayHelpers.mostrar(vectorA);
        arrayHelpers.mostrar(vectorB);
        arrayHelpers.mostrar(vectorC);
    }

}
