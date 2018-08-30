//Un cine de un pueblo pequeño nos propone hacer una aplicación para controlar
//las personas de una cola de un cine en los grandes estrenos de películas. Un
//conjunto de personas esperaran la cola para sacar una entrada, tendremos que
//calcular la entrada según la edad de la persona (mínimo 5 años). La edad de las
//personas se generan aleatoriamente entre 5 y 60 años. Os recomiendo realizar un
//método en el main para generar Personas en la cola. Al final, deberemos mostrar
//la cantidad total recaudada. El número de personas de la cola se elige al azar entre
//0 y 50.
package listasguia5;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio11 {

    public static void main(String[] args) {
        int cant, apagar=0;
        List <Integer> personas = new ArrayList();
        cant=(int)(Math.random()*51);
        apagar=generadorEdades(personas, cant, apagar);
        System.out.println(apagar);
        for(int i:personas){
            System.out.println(i);
        }
    }
    
    public static int generadorEdades(List edades, int cant, int precio){
        for (int i=0;i<cant;i++){
            edades.add((int)(Math.random()*56+5));
            int num=(int)(edades.get(i));
            if (num>=5 && num<=10){
                precio=precio+75;
            }
            else if(num>=11 && num<=17){
                precio=precio+125;
            }
            else if (num>=18){
                precio=precio+250;
            }
        }
        return precio;
    }
    
}
