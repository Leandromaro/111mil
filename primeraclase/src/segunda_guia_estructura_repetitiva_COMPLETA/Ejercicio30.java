/*
En la Cámara de Diputados se levanta una encuesta con todos los integrantes con el fin de 
determinar qué porcentaje de los n diputados está a favor del Tratado de Libre Comercio, que 
porcentaje está en contra y que porcentaje se abstiene de opinar.  */
package segunda_guia_estructura_repetitiva_COMPLETA;
import java.util.Scanner;
public class Ejercicio30 {

    public static void main(String[] args) {
        Scanner pant = new Scanner (System.in);
        int totalDisputados, opcion;
        double favor=0, contra=0, nulo=0;
        System.out.println("cuantos diputados hay");
        totalDisputados=pant.nextInt();
        for (int x=1; x<=totalDisputados; x++){
            System.out.println("Voto nº"+x+":\n1=A Favor\n2=En contra\n3=Sin opinion");
            opcion=pant.nextInt();
            switch (opcion){
                case 1:
                    favor++;
                    break;
                case 2:
                    contra++;
                    break;
                case 3:
                    nulo++;
                    break;
            }
        }
        System.out.println("el porcentaje de disputados que estan a favor "+((favor/totalDisputados)*100));
        System.out.println("el porcentaje de disputados que estan en contra "+((contra/totalDisputados)*100));
        System.out.println("el porcentaje de disputados que no dieron opinion "+((nulo/totalDisputados)*100));
    }
    
}
