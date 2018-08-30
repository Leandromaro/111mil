/* Crear el juego del ahorcado. Primero definir la palabra a buscar en el
codigo y luego ir preguntado por teclado letras. El jugador cuenta con
6 oportunidades, si el jugador en esas oportunidades ingresa toda las letras
gana, sino pierde
a.generar un arreglo con la frase a buscar (quitarle los espacios en blanco
y transformarlo a minuscula)
b.ir sustituyendo por espacios vacios la posicion donde el jugador acerto el
valor
c.Verificar luego de cada jugada si el jugador gano. (el arreglo de las palabras
debe contener solo valores vacios)
*/
package tercera_guia_arreglos_COMPLETA;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner pant = new Scanner (System.in);
        String intento, palabra;
        System.out.println("ingrese una palabra");
        palabra=pant.next();
        palabra=palabra.toLowerCase();
        char[] Ccaracteres = palabra.toCharArray();
        char[] vectorMostrado=new char [Ccaracteres.length];
        int cantidadIntentos=6;
        String intentoUsuario;
        while(cantidadIntentos>0){
            int contador=Ccaracteres.length, contadorCompleto=vectorMostrado.length;
            System.out.println("ingrese un caracter");
            intentoUsuario=pant.next();
            char caracter = intentoUsuario.charAt(0);
            for(int x=0;x<Ccaracteres.length;x++){
                if (caracter!=Ccaracteres[x]){
                    contador--;
                }
                else if (caracter==Ccaracteres[x]){
                    vectorMostrado[x]=Ccaracteres[x];
                }
                if (contador==0){
                    cantidadIntentos--;
                    System.out.println("le quedan "+cantidadIntentos+" intentos");
                }
            }
            for (int i=0;i<vectorMostrado.length;i++){
                System.out.print(vectorMostrado[i]);
            }
            System.out.println();
            for (int x=0;x<Ccaracteres.length;x++){
                if (vectorMostrado[x]==Ccaracteres[x]){
                    contadorCompleto--;
                }
            }
            if (cantidadIntentos==0){
                System.out.println("usted perdio");
            }
            if (contadorCompleto==0){
            cantidadIntentos=0;
                System.out.println("usted gano");
        }
    } 
}
}
