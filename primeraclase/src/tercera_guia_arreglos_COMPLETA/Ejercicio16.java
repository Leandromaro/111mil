/*generar una matriz de 5x5 con caracteres aleatorios, contar cuantas
veces aparece una vocal y cual vocal aparece mas veces
 */
package tercera_guia_arreglos_COMPLETA;

public class Ejercicio16 {

    public static void main(String[] args) {
            char letras[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
            int fila=5, columna=5;
            int a=0,e=0,i=0,o=0,u=0;
            char vector[][]=new char [fila][columna];
            for (int x=0;x<fila;x++){
                for (int z=0;z<columna;z++){
                    vector[x][z]=letras[(int)(Math.random()*(26))];
                }
            }
            for (int x=0;x<fila;x++){
                for (int z=0;z<columna;z++){
                    System.out.print(vector[x][z]+" ");
                }
                System.out.println();
            }
            for (int x=0;x<fila;x++){
                for (int z=0;z<columna;z++){
                    if (vector[x][z]==('a')){
                        a++;
                    }
                    else if (vector[x][z]==('e')){
                        e++;
                    }
                    else if (vector[x][z]==('i')){
                        i++;
                    }
                    else if (vector[x][z]==('o')){
                        o++;
                    }
                    else if (vector[x][z]==('u')){
                        u++;
                    }
                }
            }
            if (a>e && a>i && a>o && a>u){
                System.out.println("la vocal que aparecio mas fue a "+a+" veces");
            }
            else if (e>a && e>i && e>o && e>u){
                System.out.println("la vocal que aparecio mas fue e "+e+" veces");
            }
            else if (i>e && i>a && i>o && i>u){
                System.out.println("la vocal que aparecio mas fue i "+i+" veces");
            }
            else if (o>e && o>i && o>a && o>u){
                System.out.println("la vocal que aparecio mas fue o "+o+" veces");
            }
            else if (u>e && u>i && u>o && u>a){
                System.out.println("la vocal que aparecio mas fue u "+u+" veces");
            }
            else{
                System.out.println("aparecieron la misma cantidad de vocales");
            }
        }
            
    }
    

