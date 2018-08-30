/*sobre el array de caracteres contar cuantas veces aparece una vocal y cual
es la que mas aparece
 */
package tercera_guia_arreglos_COMPLETA;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner pant = new Scanner (System.in);
        System.out.println("ingrese texto");
        String cadena=pant.next();
        char[] Ccaracteres = cadena.toCharArray();
        int a=0,e=0,i=0,o=0,u=0;
        for (int x=0;x<Ccaracteres.length;x++){
            System.out.println(Ccaracteres[x]);
            if (Ccaracteres[x]==('a')){
                a++;
            }
            else if (Ccaracteres[x]==('e')){
                e++;
            }
            else if (Ccaracteres[x]==('i')){
                i++;
            }
            else if (Ccaracteres[x]==('o')){
                o++;
            }
            else if (Ccaracteres[x]==('u')){
                u++;
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
            System.out.println("no se ingreso ninguna vocal");
        }
    }
    
}
